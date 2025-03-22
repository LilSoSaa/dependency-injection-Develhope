package com.example.dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    // Constructor
    public MyComponent() {
        System.out.println("MyComponent constructor");
        this.myComponentName = "Giovanni";
    }

    // Getter method
    public String getMyComponentName() {
        System.out.println("MyComponent.getMyComponentName() è stato chiamato");
        return myComponentName;
    }
}
