package com.springdeploy.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //@Value("${app.username}")
    //String username;

    @GetMapping("/hola")
    public String hola(){
        return "Hola Como estas?";
    }

    @GetMapping("/hola/{name}")
    public String hola_name(@PathVariable String name){
        return "Hola "+name+" Como estas?";
    }
}
