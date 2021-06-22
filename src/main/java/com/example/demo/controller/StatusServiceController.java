package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusServiceController {

    @GetMapping("/service/status")
    public Object status() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
