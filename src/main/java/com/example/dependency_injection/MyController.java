package com.example.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyService myService;

    // Costruttore che usa l'iniezione delle dipendenze
    @Autowired
    public MyController(MyService myService) {
        System.out.println("MyController constructor");
        this.myService = myService;
    }

    // Mapping per la rotta /getName
    @GetMapping("/getName")
    public String getName() {
        return myService.getName();
    }

    // Mapping per la rotta predefinita
    @GetMapping("/")
    public String welcome() {
        return "Benvenuto nell'applicazione Spring Boot!";
    }
}
