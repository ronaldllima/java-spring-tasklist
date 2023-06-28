package com.example.tasklist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.tasklist.model.Task;
import com.example.tasklist.repository.TaskRepository;


@Controller
@RequestMapping("/tasks")
public class TaskController {
    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping
    public String getAllTasks(Model model) {
        model.addAttribute("tasks", taskRepository.findAll());
        return "tasks";
    }

    @GetMapping("/create")
    public String getCreateTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "createTaskForm";
    }

    @PostMapping("/create")
    public String createTask(@ModelAttribute("task") Task task) {
        taskRepository.save(task);
        return "redirect:/tasks";
    }

    @GetMapping("/{id}/edit")
    public String getEditTaskForm(@PathVariable("id") Long id, Model model) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid task Id: " + id));
        model.addAttribute("task", task);
        return "editTaskForm";
    }

    @PostMapping("/{id}/edit")
    public String editTask(@PathVariable("id") Long id, @ModelAttribute("task") Task taskDetails) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid task Id: " + id));
        task.setDescription(taskDetails.getDescription());
        taskRepository.save(task);
        return "redirect:/tasks";
    }

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable("id") Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid task Id: " + id));
        taskRepository.delete(task);
        return "redirect:/tasks";
    }
}