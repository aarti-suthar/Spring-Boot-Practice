package com.springbootcourse.aarti.Week1.Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env", havingValue = "production")
public class ProdDB implements DB{

    public String getData(){
        return "Production Data";
    }
}
