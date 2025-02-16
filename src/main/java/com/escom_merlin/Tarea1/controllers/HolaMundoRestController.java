package com.escom_merlin.Tarea1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HolaMundoRestController {
    @GetMapping("/tarea1")
    public String helloWorld(){
        return "¡Hola Spring!";
    }
}
