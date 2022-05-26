package com.otaviolube.repository;

import org.springframework.stereotype.Controller;



@Controller
@RequestMapping("carro")


public class CarroController {
	
	@GetMapping("/lista")
	
    public ModelAndView listaCarros(){

        ModelAndView mv = new ModelAndView("listaDeCarros");

        return mv;

    }
	
	
	
}
