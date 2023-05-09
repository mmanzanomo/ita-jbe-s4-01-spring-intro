package cat.itacademy.barcelonactiva.manzanomontero.miguel.s04.t01.n01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String Saluda(@RequestParam(defaultValue = "UNKNOWN") String nom) {
        return "Hola, " + nom + ". Estàs executant un projecte Maven.";
    }

    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String Saluda2(@PathVariable(required=false) String nom) {
        nom = nom != null ? nom : "UNKNOWN";
        return "Hola, " + nom + ". Estàs executant un projecte Maven.";
    }

}
