package com.springbootcourse.aarti.Week1.Introduction.IntroductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class Apple {
    void eatApple(){
        System.out.println("I am eating apple");
    }

    @PostConstruct
    void callThisBeforeAppleIsUsed(){
        System.out.println("Creating the apple before use");
    }

    @PreDestroy
    void callThisBeforeDestroy(){
        System.out.println("Destroying the apple bean");
    }
}
