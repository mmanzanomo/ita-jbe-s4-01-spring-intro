package cat.itacademy.barcelonactiva.manzanomontero.miguel.s04.t01.n02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String Saluda(@RequestParam(defaultValue = "UNKNOWN") String nom) {
        return "Hola, " + nom + ". Estàs executant un projecte Gradle.";
    }

    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String Saluda2(@PathVariable(required = false) String nom) {
        nom = nom != null ? nom : "UNKNOWN";
        return "Hola, " + nom + ". Estàs executant un projecte Gradle.";
    }
}
