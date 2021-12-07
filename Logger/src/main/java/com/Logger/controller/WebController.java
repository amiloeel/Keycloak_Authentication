package com.Logger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    
    @GetMapping( path = "/")
    public String index(){
        return "index";
    }


    @GetMapping(path = "/private")
    public String secure(Model model) {
        model.addAttribute("message", "Eu sou uma pagina segura!");
        return "secure";
    }


}
