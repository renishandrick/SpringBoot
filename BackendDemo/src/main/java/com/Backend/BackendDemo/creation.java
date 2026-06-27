package com.Backend.BackendDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class creation {
    @GetMapping("/create")
    String createName(@RequestParam String user,@RequestParam String pass){
        return user+pass;
    }
}
