package br.org.generation.hello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmController {
    
    @GetMapping
	public String habilidades() {
		
        return  "<b>Mentalidades</b>"
                + "<br /> "
                + "<br /> Orientação ao futuro"
				+ "<br /> Responsabilidade pessoal"
                + "<br /> Mentalidade de crescimento"
                + "<br /> Persistência"
                + "<br /> "
                + "<br /> <b>Habilidades</b>"
                + "<br /> "
                + "<br /> Trabalho em equipe"
                + "<br /> Atenção aos detalhes"
                + "<br /> Proatividade"
				+ "<br /> Comunicação";
	}

}