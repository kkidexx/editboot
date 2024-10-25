package com.sprinboot.springweb.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index"; // Retorna el archivo index.html de la carpeta templates
    }
}
