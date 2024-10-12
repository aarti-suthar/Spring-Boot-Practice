package com.springbootcourse.aarti.Week1.Introduction.IntroductionToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.swing.*;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    Apple getApple(){
        return new Apple();
    }


}
