package com.springbootcourse.aarti.Week1.Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@ConditionalOnProperty(name="deploy.env", havingValue = "development")
public class DevDB implements DB {

    public String getData(){
        return "Development Data";
    }
}
