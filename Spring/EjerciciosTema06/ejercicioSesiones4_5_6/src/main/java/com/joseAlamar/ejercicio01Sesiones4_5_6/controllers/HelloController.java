package com.joseAlamar.ejercicio01Sesiones4_5_6.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/saludo")
    public String saludar() {
        return "Muy buenas, saludos desde Spring ok";
    }
}
