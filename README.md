# Sistema de Cadastro de Alunos - Projeto em Java com MySQL

https://github.com/user-attachments/assets/ec382807-bbb8-447c-85cc-4f3afa150742

Este projeto foi desenvolvido em junho de 2023, durante os meus estudos de Programação Orientada a Objetos (POO) em Java. A aplicação tem como objetivo ser um sistema de cadastro de alunos, utilizando `JFrame` para a interface gráfica e MySQL para armazenar os dados. Através dessa aplicação, é possível realizar operações de CRUD (Create, Read, Update e Delete) em um banco de dados local, além de permitir a inclusão de fotos dos alunos, que são armazenadas e exibidas diretamente na interface.

O projeto abrange os seguintes recursos:
- **Painel de Login**: Tela inicial de autenticação, protegendo o acesso ao sistema.
- **Cadastro de Alunos**: Permite inserir o nome, matrícula e foto do aluno.
- **Exibição de Alunos**: Lista os alunos cadastrados em uma tabela (`JTable`).
- **Atualização e Exclusão**: Opções para atualizar informações dos alunos ou remover cadastros existentes.
- **Manipulação de Imagens**: Upload de fotos para cada aluno e visualização na interface.

## Tecnologias Utilizadas

- **Linguagem**: Java
- **Banco de Dados**: MySQL
- **Bibliotecas Gráficas**: Swing (`JFrame`, `JTable`, `JLabel`, `JButton`)
- **Conexão ao Banco de Dados**: JDBC (Java Database Connectivity)

### Estrutura do Código

O projeto está organizado da seguinte forma:

- **Conexão com o Banco de Dados (`database.java`)**:
  - Contém a lógica para conectar ao banco de dados MySQL utilizando JDBC.

- **Interface Gráfica (`Cadastro.java`)**:
  - As classes responsáveis por desenhar a interface gráfica, incluindo o painel de login, a tela de cadastro e a tabela de exibição de alunos.

- **Manipulação de Imagens (`Cadastro.java`)**:
  - Contém métodos utilitários para redimensionar, converter e exibir imagens no formato `byte[]` para serem armazenadas no banco de dados.

### Funcionalidades

1. **Cadastro de Alunos**:
   - Preencha o nome e a matrícula no formulário e adicione uma foto. Após clicar em "Salvar", o aluno será registrado no banco de dados e exibido na tabela.

2. **Atualização de Registros**:
   - Selecione um aluno na tabela e clique em "Editar". Os campos serão preenchidos automaticamente para você poder alterar as informações.

3. **Exclusão de Registros**:
   - Selecione um aluno na tabela e clique em "Excluir". O registro será removido do banco de dados permanentemente.

4. **Visualização de Imagens**:
   - Ao selecionar um aluno, a foto correspondente será exibida no painel lateral, facilitando a identificação visual.


## Como Executar o Projeto

Para executar esta aplicação, siga as instruções abaixo:

### Pré-requisitos

1. **Instalar o JDK (Java Development Kit)**:
   - Baixe e instale a versão mais recente do [JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. **Instalar o MySQL**:
   - Baixe e instale o [MySQL Server](https://dev.mysql.com/downloads/mysql/) e o [MySQL Workbench](https://dev.mysql.com/downloads/workbench/), caso queira um ambiente gráfico para gerenciar o banco de dados.

3. **Adicionar o Driver JDBC ao Projeto**:
   - Baixe o conector JDBC do [site oficial](https://dev.mysql.com/downloads/connector/j/) e adicione-o ao classpath do projeto no seu ambiente de desenvolvimento (por exemplo, Eclipse ou IntelliJ).

### Configuração do Banco de Dados

1. **Criar o Banco de Dados**:
   - Após configurar o MySQL, crie um banco de dados chamado `escola`. Você pode usar o comando abaixo no MySQL Workbench ou na linha de comando do MySQL:
     ```sql
     CREATE DATABASE escola;
     ```

2. **Criar a Tabela de Alunos**:
   - Dentro do banco de dados `escola`, crie a tabela `alunos` com o seguinte comando:
     ```sql
     CREATE TABLE alunos (
       id INT AUTO_INCREMENT PRIMARY KEY,
      nome VARCHAR(100) NOT NULL,
      matricula VARCHAR(9) NOT NULL,
      turma VARCHAR(25) NOT NULL,
      foto LONGBLOB
      );
     ```

3. **Configurar a Conexão no Código**:
   - Abra o arquivo de código onde a conexão com o banco de dados é estabelecida (por exemplo, `database.java`).
   - Verifique as credenciais e a URL de conexão. As informações padrão são:
     ```java
     String url = "jdbc:mysql://localhost:3307/escola";
     String user = "root";
     String password = "root";
     ```
   - Caso esteja utilizando um nome de usuário e senha diferentes no MySQL, atualize esses valores no código.

### Executando o Projeto

1. **Importar o Projeto no seu IDE**:
   - Abra seu ambiente de desenvolvimento (Apache NetBeans) e importe o projeto como um projeto Java.

2. **Compilar e Executar**:
   - Compile o projeto e execute a classe principal `Cadastro.java`.
   - O painel de login será exibido primeiro. Insira as credenciais predefinidas (por exemplo, `admin` para o nome, `ABC` para a turma, `123456789` para a matrícula e por fim insira uma foto em `Add Image`).

3. **Utilizando o Sistema**:
   - Após o login, a tela principal exibirá uma tabela com os alunos cadastrados.
   - Use os botões na interface para adicionar novos alunos, atualizar registros ou deletar entradas.
   - Para adicionar uma foto, clique no botão "Escolher Foto", selecione a imagem no seu computador e, em seguida, cadastre o aluno.

## Licença

Este projeto é de uso livre e pode ser modificado conforme necessário para estudo e aprimoramento pessoal.

---

Qualquer dúvida ou sugestão, sinta-se à vontade para entrar em contato!

Meu LinkedIn: [Brayan Pletsch](https://www.linkedin.com/in/brayan-pletsch/)

Meu Email: brayan.pletsch@gmail.com

Meu Site: [brayan.blog](https://brayan.blog/)

Link do projeto: [Sistema de Cadastro de Alunos no GitHub](https://www.github.com/BigBraim/Banco-de-dados)
