package com.leonardorocha.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {
    
    @GetMapping("/mensagem")
    public String getMensagem() {
        // System.out.println("Endpoint /api/mensagem chamado!");
        return "Dados do back-end Spring Boot!";
    }

    @PostMapping("/dados")
    public String receberDados(@RequestBody String dados) {
        return "Recebido: " + dados;
    }
}
