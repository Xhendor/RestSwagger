package com.uabc.edu.app.practica1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("/")
    public String saludito(){

        return "<b>Holis!!!</b><br>" +
                "<div style=\"color:red\">" +
                " Bienvenido al purgatorio</div>";
    }

    @GetMapping("/suma")
    public double suma(@RequestParam(value = "numA") double a,
                       @RequestParam(value = "numB") double b){
        return a+b;
    }
    @GetMapping("/resta")
    public double resta(@RequestParam(value = "numA") double a,
                       @RequestParam(value = "numB") double b){
        return a-b;
    }//localhost:8080/suma?numA=20&numB=70


}
