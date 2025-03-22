package com.example.dependency_injection;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MyComponent myComponent;

    // Costruttore che utilizza l'iniezione delle dipendenze tramite costruttore
    public MyService(MyComponent myComponent) {
        System.out.println("MyService constructor");
        this.myComponent = myComponent;
    }

    // Metodo per chiamare e restituire il nome da MyComponent
    public String getName() {
        System.out.println("MyService.getName() è stato chiamato");
        return myComponent.getMyComponentName();
    }
}
