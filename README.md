# 🚀 Credit Application System

![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)
![H2](https://img.shields.io/badge/H2-0066A1?style=for-the-badge&logo=h2&logoColor=white)
![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black)

---

<figure>
<p align="center">
  <img src="https://i.imgur.com/7phya16.png" height="450" width="650" alt="API para Sistema de Avaliação de Créditos"/><br>
  Diagrama UML Simplificado de uma API para Sistema de Avaliação de Crédito
</p>
</figure>
<figure>
<p align="center">
  <img src="https://i.imgur.com/1Ea5PH3.png" height="350" width="600" alt="Arquitetura em 3 camadas Projeto Spring Boot"/><br>
  Arquitetura em 3 camadas Projeto Spring Boot
</p>
</figure>
<p align="center">
  <b>Este projeto segue o desafio proposto por <a href="https://gist.github.com/cami-la/560b455b901778391abd2c9edea81286">Camila Cavalcante - DIO</a></b>
</p>

---

## 📘 Sobre o Projeto

Este projeto consiste no desenvolvimento da **primeira API RESTful** utilizando **Kotlin** com **Spring Boot**, com o objetivo de implementar um sistema simples de **gestão de créditos**.  
A aplicação permite o **cadastro de clientes**, **solicitação de créditos** e o gerenciamento de informações relacionadas.

---

## 🛠️ Tecnologias Utilizadas

- 💻 **Kotlin**
- 🌱 **Spring Boot**
- 📄 **Spring Data JPA**
- 🗃️ **H2 Database**
- 🐘 **Gradle**
- 🛫 **Flyway**
- ✅ **Spring Validation**
- 📚 **Swagger**

---

## 🎯 Funcionalidades

- ✅ Cadastro, edição e exclusão de clientes
- ✅ Solicitação de créditos
- ✅ Validação de dados via anotações (`@Valid`, `@NotBlank`, etc)
- ✅ Listagem de créditos por cliente
- ✅ Visualização de detalhes de um crédito específico

---

## 📦 Requisitos

- Java 17+
- IntelliJ IDEA (recomendado)
- Gradle

---

## ▶️ Como Executar o Projeto

```bash
# Clone o repositório
git clone https://github.com/PedroThiago02/Credit-Application-System.git

# Acesse a pasta do projeto
cd Credit-Application-System

# Execute o projeto
./gradlew bootRun
```

> No Windows, utilize:  
> `gradlew.bat bootRun`

---

## 🌐 Endpoints e Documentação

- Aplicação: `http://localhost:8080`
- Swagger UI: `http://localhost:8080/swagger-ui.html`

---

## 📁 Estrutura do Projeto

```
📦 src
 ┣ 📂main
 ┃ ┣ 📂kotlin
 ┃ ┃ ┗ 📂com.example.credit
 ┃ ┃   ┣ 📂controller
 ┃ ┃   ┣ 📂model
 ┃ ┃   ┣ 📂repository
 ┃ ┃   ┗ 📂service
 ┃ ┗ 📂resources
 ┃   ┣ application.yml
 ┃   ┗ db/migration
```

---

## 👨‍💻 Autor

Desenvolvido por [Pedro Thiago](https://github.com/PedroThiago02)  
📚 Projeto criado como parte do aprendizado de APIs REST com Kotlin + Spring Boot.

---

## 🌟 Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir _issues_, propor melhorias ou enviar _pull requests_.
