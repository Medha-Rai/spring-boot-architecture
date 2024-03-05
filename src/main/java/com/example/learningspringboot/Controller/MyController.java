package com.example.learningspringboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapi")
public class MyController {

    @GetMapping("/firstendpoint")
    public String getData(){
        return "Hello from Md. \n You created your first endpoint";
    }

}
