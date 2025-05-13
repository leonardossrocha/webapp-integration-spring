package com.leonardorocha.projeto_integracao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan; // para forçar o mapeamento

@SpringBootApplication
@ComponentScan(basePackages = {"com.leonardorocha.projeto_integracao", "com.leonardorocha.controller"})
public class ProjetoIntegracaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoIntegracaoApplication.class, args);
	}

}
