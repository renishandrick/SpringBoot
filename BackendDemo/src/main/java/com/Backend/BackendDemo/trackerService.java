package com.Backend.BackendDemo;
import com.Backend.BackendDemo.entites.tracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class trackerService {
    @Autowired
    private trackerRepository tr;
    public tracker createTracker(tracker t){
        return tr.save(t);
    }
}
