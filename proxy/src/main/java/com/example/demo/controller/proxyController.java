package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class proxyController {
    int index = 0;
    String[] urls= {"http://23.20.105.209:8080", "http://35.171.112.228:8080"};
    @Autowired
    HttpConnectionExample httpConnectionExample;
    @RequestMapping(value = "/**")
    public ResponseEntity<?>
    getProxy(HttpServerletRequest httpServerletRequest) throws IOException {
        index = (index + 1)% urls.length;
        String server = urls[index];
        String path = httpServerletRequest.getRequestURI();
        String query = httpServerletRequest.getQueryString() != null ? "?" + httpServerletRequest.getQueryString():"";
        String url = server + path + query;
        String response = httpConnectionExample.get(url);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(response);
    }
}