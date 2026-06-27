package com.Backend.BackendDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/track")
public class trackerController {
    @Autowired
    private trackerService ts;
    @GetMapping("/get")
    String tracker(){
        ts.printOf();
        return "tracking";
    }
}
