package com.otaviolube.repository;

import org.springframework.stereotype.Controller;
import javax.persistence.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
@RequestMapping("carro")


public class CarroController {
	
	@GetMapping("/lista")
	
    public ModelAndView listaCarros(){

        ModelAndView mv = new ModelAndView("listaDeCarros");

        return mv;

    }
	
	
	
}
