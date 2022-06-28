package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmController {
	
	@GetMapping
	public String bsmController () {
    return "Comunicação,Persistência,Mentalidade de Crescimento,Proatividade,"
    		+ "Responsabilidade Pessoal,Atenção aos Detalhes, Trabalho em Equipe, "
    		+ "Orientação ao Futuro";
}
}
