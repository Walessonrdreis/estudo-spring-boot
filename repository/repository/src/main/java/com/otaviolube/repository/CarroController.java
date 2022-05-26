package com.otaviolube.repository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("carro")


public class CarroController {
	
	@GetMapping("/lista")
	
    public ModelAndView listaCarros(){

        ModelAndView mv = new ModelAndView("listaDeCarros");

        return mv;

    }
	
	
	
}
