package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class proxyController {
    int index = 0;
    String urls[]= {"http://23.20.105.209:8080", "http://35.171.112.228:8080"};
    @Autowired index = (index + 1) % urls.length();


    
}
