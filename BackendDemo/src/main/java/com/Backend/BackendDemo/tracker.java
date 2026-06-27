package com.Backend.BackendDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/tracking")

public class tracker {
    @GetMapping("/id/{id}")
    String trackById(@PathVariable String id){
        return "trackById";
    }
    @GetMapping("/name/{name}")
    String trackByName(@PathVariable String name){
        return "name da boii";
    }
}
