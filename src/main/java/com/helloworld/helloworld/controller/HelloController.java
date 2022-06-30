package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello () {
    return "hello world";
}
	@GetMapping("/bsm")
	public String bsm() {
		return "Comunicação,Persistência,Mentalidade de Crescimento,Proatividade,"
				+ "Responsabilidade Pessoal,Atenção aos Detalhes, Trabalho em Equipe,"
				+ "Orientação ao Futuro";
	}
	
	@GetMapping("/objetivo")
	public String objetivo() {
		return "Participar do bootcamp,aprender novos conteudos,"
	    		+ "fazer as atividades diárias,desenvolver o blog pessoal,"
	    		+ "desenvolver o projeto integrador";
	}
}


