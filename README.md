# Integração entre Back-end (Java Spring Boot) e Front-end (HTML/CSS/JS)

Este projeto demonstra uma aplicação web simples com integração entre front-end (HTML, CSS, JavaScript) e back-end desenvolvido com Spring Boot (Java). O objetivo é ilustrar como um navegador pode se comunicar com uma API REST utilizando `fetch`.

---

## 📁 Estrutura do Projeto

```
projeto-integracao/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/com/leonardorocha/projeto_integracao/
│   │   │   ├── ProjetoIntegracaoApplication.java
│   │   │   ├── ServletInitializer.java
│   │   │   └── controller/ApiController.java
│   │   └── resources/static/
│   │       ├── index.html
│   │       └── js/app.js
│   └── test/
```

---

## 🌐 Front-end

O front-end é composto por:
- `index.html`: interface com botões e campo de entrada
- `app.js`: realiza requisições `fetch` para a API
- `CSS`: embutido no HTML, para layout básico

### Funcionalidades
- `GET /api/mensagem`: ao clicar em "Buscar Mensagem", o front-end faz uma requisição GET e exibe a resposta.
- `POST /api/dados`: ao digitar um texto e clicar em "Enviar", o front-end envia os dados via POST e exibe a resposta.

---

## 🚀 Back-end (Spring Boot)

### Classe principal: `ProjetoIntegracaoApplication.java`
```java
@SpringBootApplication
@ComponentScan(basePackages = {"com.leonardorocha.projeto_integracao", "com.leonardorocha.controller"})
```
- `@SpringBootApplication`: ativa a configuração automática, scanning de componentes e configuração de contexto.
- `@ComponentScan(...)`: garante que pacotes externos sejam escaneados para incluir controladores personalizados.

### Controlador REST: `ApiController.java`
```java
@RestController
@RequestMapping("/api")
```
- `@RestController`: indica que os métodos retornam dados (em vez de views)
- `@RequestMapping("/api")`: prefixa todos os endpoints da classe com `/api`

#### Endpoints:
```java
@GetMapping("/mensagem")
public String getMensagem()
```
- Responde ao `GET /api/mensagem` com texto simples.

```java
@PostMapping("/dados")
public String receberDados(@RequestBody String dados)
```
- Recebe dados enviados via `POST` no corpo da requisição e responde com o mesmo conteúdo formatado.

### Classe ServletInitializer.java
Usada para permitir a implantação como `.war` em servidores externos:
```java
public class ServletInitializer extends SpringBootServletInitializer {
    protected SpringApplicationBuilder configure(...) { ... }
}
```

---

## 📢 Como a comunicação funciona

1. O usuário acessa `index.html` via navegador.
2. Ao clicar em um botão, o `app.js` envia uma requisição HTTP para o back-end.
3. O Spring Boot recebe a requisição, processa no `ApiController` e responde.
4. O JavaScript trata a resposta e atualiza a página dinamicamente.

---

## ✅ Como Executar Localmente

1. Clone este repositório:
```bash
git clone https://github.com/seu-usuario/projeto-integracao.git
cd projeto-integracao
```
2. Compile e execute:
```bash
./mvnw spring-boot:run
```
3. Acesse:
```
http://localhost:8080
```

---

## 📖 Referências
- https://spring.io/guides
- https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API
- https://start.spring.io/

---

> Projeto desenvolvido com propósito educacional, promovendo a compreensão integrada de camadas client-server e seu papel na construção de soluções web acessíveis.
