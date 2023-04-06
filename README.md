<h1>CRUD API em Java</h1>

<p>Este projeto é uma implementação simples de uma API CRUD (Create, Read, Update, Delete) em Java, usando o framework Spring Boot. A API permite que os usuários criem, visualizem, atualizem e excluam registros de uma base de dados.</p>

<h2>Pré-requisitos</h2>

<p>Para executar este projeto, você precisará ter as seguintes ferramentas instaladas em seu sistema:</p>

<ul>
  <li>Java 8 ou superior</li>
  <li>Maven</li>
  <li>IDE Java, como Eclipse ou IntelliJ IDEA</li>
 
</ul>

<h2>Executando o projeto</h2>

<p>Para executar o projeto, siga os seguintes passos:</p>

<ol>
  <li>Clone este repositório em sua máquina.</li>
  <li>Importe o projeto em sua IDE Java.</li>
  <li>Execute a classe <code>CrudApiJavaApplication.java</code>.</li>
  <li>A aplicação será iniciada e estará disponível em <code>http://localhost:8080</code>.</li>
</ol>

<h2>Endpoints da API</h2>

<p>A API possui os seguintes endpoints:</p>

<ul>
  <li><code>GET /usuarios</code>: retorna uma lista com todos os usuários cadastrados.</li>
  <li><code>GET /usuarios/{id}</code>: retorna um usuário específico pelo seu ID.</li>
  <li><code>POST /usuarios</code>: cria um novo usuário.</li>
  <li><code>PUT /usuarios/{id}</code>: atualiza um usuário existente pelo seu ID.</li>
  <li><code>DELETE /usuarios/{id}</code>: exclui um usuário existente pelo seu ID.</li>
</ul>

<p>Para testar a API, você pode usar uma ferramenta como o Postman ou o cURL.</p>

<h2>Conclusão</h2>

<p>Este é um exemplo básico de uma API CRUD em Java usando o Spring Boot. Você pode estender este projeto adicionando mais funcionalidades e endpoints para atender às necessidades específicas do seu projeto.</p>
