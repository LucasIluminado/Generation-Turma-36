package br.org.generation.hello3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivoHelloController {
    
    @GetMapping
	public String objetivos() {
		return "<b>Objetivo de aprendizagem da semana:</b>"
				+ "<br /> "
				+ "<br /> Manter me atualizado do conteúdo e tratar duvidas referentes aque esta sendo passado!!!";
		
    }
    
}