package com.HelloWorldExample.Hello.World.Example;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest Controller annotation is used for making restful web services with the help of the @RestController.
//This annotation is used at the class level and allows the class to handle the requests ade by the client.
//The rest controller allows to handle all the REST API's such as GET, PUT, POST, DELETE, PATCH
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String print(){
        return "Hello World!";
    }
}
