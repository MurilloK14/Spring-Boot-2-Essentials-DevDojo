# Spring Boot Essentials - DevDojo

Projeto desenvolvido durante o curso **Spring Boot Essentials** do canal [DevDojo](https://github.com/devdojobr/springboot2-essentials), ministrado por William Suane.

O projeto consiste em uma API RESTful completa para gerenciamento de animes, cobrindo desde a arquitetura em camadas e boas práticas com Spring Boot até tratamento global de erros e uma suíte completa de testes automatizados (unitários e de integração).

---

## 🛠️ Tecnologias e Bibliotecas

- **Java 21 / 26**
- **Spring Boot 3** (Spring Data JPA, Spring Web, Spring Validation)
- **H2 Database** (para testes em memória)
- **MySQL** (banco relacional com Docker Compose)
- **Lombok** (produtividade e redução de boilerplate)
- **MapStruct** (mapeamento de DTOs de alta performance)
- **JUnit 5, AssertJ & Mockito** (testes unitários e mocks)
- **TestRestTemplate** (testes de integração ponta a ponta)
- **Docker Compose**

---

## 🚀 O que foi construído

1. **CRUD Completo:**
   - Camadas `Controller`, `Service` e `Repository` bem desacopladas.
   - DTOs dedicados para entrada (`AnimePostRequestBody` e `AnimePutRequestBody`).
   - Mapeamento automático de entidades com **MapStruct**.

2. **Paginação e Parâmetros:**
   - Suporte a paginação nativa do Spring Data (`Pageable`, `Page<Anime>`).
   - Configuração customizada de fallback de paginação via `WebMvcConfigurer`.

3. **Tratamento Centralizado de Exceções:**
   - Uso de `@RestControllerAdvice` no `RestExceptionHandler`.
   - Formatação consistente de respostas de erro (`BadRequestExceptionDetails`, `ValidationExceptionDetails`).

4. **Cliente HTTP:**
   - Exemplos práticos de consumo de APIs externas com `RestTemplate` em `SpringClient`.

5. **Suíte Abrangente de Testes:**
   - **Camada de Repositório (`@DataJpaTest`):** Testes de persistência, busca por ID/nome e validação de constraints no H2.
   - **Camada de Serviço e Controller (`Mockito`):** Testes unitários isolados com mocks e verificação de comportamento.
   - **Testes de Integração (`@SpringBootTest`):** Validação real de endpoints HTTP com `TestRestTemplate` e desserialização customizada de páginas (`PageableResponse`).

---

## 🧪 Como Executar os Testes

Para rodar toda a suíte de testes automatizados:

```bash
./mvnw clean test
```

---

## 📦 Como Subir a Aplicação Localmente

1. Suba o banco de dados MySQL via Docker:
   ```bash
   docker-compose up -d
   ```

2. Execute o projeto Spring Boot:
   ```bash
   ./mvnw spring-boot:run
   ```
