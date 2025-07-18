# API de Produtos

Este é um projeto de uma API REST simples para cadastro e listagem de produtos, desenvolvido com Spring Boot.

## Tecnologias Utilizadas

* **Java 17**
* **Spring Boot 3.5.3**
* **Maven**
* **Spring Web**
* **Spring Data JPA**
* **H2 Database (banco de dados em memória)**
* **Lombok**

## Sobre o Projeto

O projeto consiste em uma API que expõe endpoints para gerenciar produtos (entidade `Produto`). As principais funcionalidades são:

* **Cadastro de Produtos:** Permite a criação de novos produtos informando nome e preço.
* **Listagem de Produtos:** Retorna uma lista com todos os produtos cadastrados no banco de dados.

A aplicação está configurada para rodar com um banco de dados H2 em memória, o que significa que os dados serão perdidos ao reiniciar a aplicação. A configuração de CORS permite requisições de `http://localhost:3000` e `http://localhost:4200`.

## Endpoints da API

A API possui os seguintes endpoints definidos no `ProdutoController`:

### Listar Produtos

* **Método:** `GET`
* **URL:** `/listar`
* **Descrição:** Retorna uma lista de todos os produtos cadastrados.

### Cadastrar Produto

* **Método:** `POST`
* **URL:** `/cadastrar`
* **Descrição:** Cadastra um novo produto.
* **Corpo da Requisição (JSON):**

    ```json
    {
      "nome": "Nome do Produto",
      "preco": 10.99
    }
    ```

## Como Executar o Projeto

1.  **Clone o repositório.**
2.  **Navegue até o diretório do projeto.**
3.  **Execute o projeto usando o Maven Wrapper:**
    ```bash
    ./mvnw spring-boot:run
    ```
4.  A aplicação iniciará e estará disponível em `http://localhost:8080`. Você pode executar a classe `ApiApplication` diretamente da sua IDE.