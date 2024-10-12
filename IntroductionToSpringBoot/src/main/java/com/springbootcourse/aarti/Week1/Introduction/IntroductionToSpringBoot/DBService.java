package com.springbootcourse.aarti.Week1.Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;

@Service
public class DBService {

    //Field Injection
    //@Autowired
    final private DB db;

    //Constructor Injection
    public DBService(DB db){
        this.db = db;
    }


    public String getData(){
        return db.getData();
    }
}
