package com.DependencyInjection.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Component annotation is used in Spring framework to mark a class as
 * a Spring managed component.
 *
 * It allows spring to automatically scan it and instantiate it, making it usable
 * in the application via dependency injection.
 */
@Component
public class Dev {

    /**
     * Autowired annotation is used for automatic dependency injection in Spring beans.
     * It can be applied to fields, constructors, or methods
     *
     * It has following two functions:
     * 1. @Autowired annotation is used to auto-inject beans
     * 2. @Autowired annotation is used for constructor injection, setter injection,
     * and field injection.
     */
    @Autowired
    //Laptop laptop;
    Computer computer;

    //Constructor injection
    //public Dev(Laptop laptop){
        //this.laptop = laptop;
    //}

    //Setter Injection
    //public void setLaptop(Laptop laptop){
        //this.laptop = laptop;
    //}
    public void build(){
        computer.compile();
        System.out.println("Building the project");
    }
}
