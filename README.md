# Spring Boot 3 JWT Security

Demostração da implementação de segurança usando Spring Boot 3.0 e JSON Web Tokens (JWT).

## Recursos

* Cadastro de usuário e login com autenticação JWT;

* Criptografia de senha usando BCrypt;

* Autorização baseada em função com Spring Security;

* Tratamento personalizado de negação de acesso;

## Tecnologias

* Spring Boot 3.0

* Spring Security

* JSON Web Tokens (JWT)

* BCrypt

* Maven

## Executando

Você precisará ter o seguinte instalado em sua máquina local:

* Java JDK 17+
* Uma IDE para executar o projeto


## Endpoints

Utilize um cliente de requisições HTTP como o ***Postman*** ou a extensão ***REST Client*** para VSCode e faça os testes no arquivo [api.rest](/api.rest).

* **Protegido**

```http
GET http://localhost:8080/api/v1/demo-controller HTTP/1.1
Authorization: Bearer {{token}}
```

* **Autenticação**

```http
POST http://localhost:8080/api/v1/auth/authenticate HTTP/1.1
Content-Type: application/json

{
    "email": "test@email.com",
    "password": "test123"
}
```

* **Registro**

```http
POST http://localhost:8080/api/v1/auth/register HTTP/1.1
Content-Type: application/json

{
    "fistName": "test",
    "lastName": "test",
    "email": "test@email.com",
    "password": "test123"
}
```

## Referência

* Amigoscode - Spring Boot 3 + Spring Security 6 - JWT Authentication and Authorisation [NEW] [2023] - <https://www.youtube.com/watch?v=KxqlJblhzfI>
