package com.Backend.BackendDemo;
import com.Backend.BackendDemo.entites.tracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class trackerService {
    @Autowired
    private trackerRepository tr;
    public tracker createTracker(tracker t){
        return tr.save(t);
    }
    public List<tracker> getAllTrackers(){
        return tr.findAll();
    }
    public tracker getTracker(int id){
        return tr.findById(id).orElse(null);
    }
    public tracker updateTracker(tracker t){
        return tr.save(t);
    }
    public String deleteTracker(int id){
        tr.deleteById(id);
        return "Deleted successfully";
    }
}
