# Lista de Tarefas com Spring MVC
Este é um projeto de exemplo que demonstra como criar uma aplicação web de lista de tarefas usando o Spring MVC, Thymeleaf, 
e o banco de dados H2. A aplicação permite que os usuários criem, atualizem e excluam tarefas.

## Tecnologias Utilizadas
- Spring MVC: Um framework para desenvolvimento de aplicações web baseado no padrão Model-View-Controller.
- Thymeleaf: Um mecanismo de renderização de templates que permite integrar facilmente com o Spring MVC.
- H2 Database: Um banco de dados relacional em memória, utilizado para persistir os dados das tarefas.
- Bootstrap: Um framework de CSS que facilita o desenvolvimento de interfaces responsivas e agradáveis.
- Maven: Gerenciador de dependências e construção do projeto.
- Java: Linguagem de programação utilizada para escrever o código do projeto.
- Mysql: Sistema gerenciador de banco de dados foi utilizado mas optei por deixar comentado tanto a dependêcia no pom.xml como as configurações no application.properties.
## Descrição do Projeto
A aplicação de lista de tarefas permite aos usuários criar, atualizar e excluir tarefas. 
Cada tarefa possui uma descrição e um identificador único. As tarefas são armazenadas no banco de dados H2 e são exibidas em uma tabela na página inicial.

O projeto utiliza o padrão Model-View-Controller (MVC), onde o modelo representa as entidades de tarefa e o acesso ao banco de dados, 
a visualização é responsável pela interface de usuário, e o controlador trata das requisições e coordena a interação entre o modelo e a visualização.

A interface de usuário é criada usando o Thymeleaf juntamente com o Bootstrap para fornecer uma aparência agradável e responsiva. 
As páginas são renderizadas dinamicamente pelo servidor e exibem as tarefas atualmente cadastradas.

O banco de dados H2 é utilizado para persistir as tarefas. A configuração do banco de dados é feita através do arquivo application.properties, 
que define a URL, o driver, o usuário e a senha do banco de dados.
## Executando o Projeto
1. Certifique-se de ter o Java JDK (versão 8 ou superior) e o Apache Maven instalados em seu sistema.
2. Clone o repositório do projeto em sua máquina local.
3. Navegue até o diretório do projeto no terminal.
4. Execute o seguinte comando para compilar e executar o projeto:
5. mvn spring-boot:run
6. Aguarde até que o aplicativo seja compilado e iniciado. Você poderá acessar o aplicativo em seu navegador através do endereço http://localhost:8080/tasks.
7. Na página inicial, você poderá criar, atualizar e excluir tarefas.
