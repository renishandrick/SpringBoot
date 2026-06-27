package com.Backend.BackendDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class trackerService {
    @Autowired
    private trackerRepository tr;
    public void printOf(){
        System.out.print(tr.track());
    }
}
