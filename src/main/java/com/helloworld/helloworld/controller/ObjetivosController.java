package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String objetivosSemana () {
    return "Participar do bootcamp,aprender novos conteudos,"
    		+ "fazer as atividades diárias,desenvolver o blog pessoal,"
    		+ "desenvolver o projeto integrador";
}
}