package com.example.aula.springboot2.demoaulaspringboot2;

import org.springframework.boot.Banner.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String usersForm(final Mode model){
        model.addAttribute("user", new User());
    }

    
}
