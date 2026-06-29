package com.Backend.BackendDemo;
import com.Backend.BackendDemo.entites.tracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
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
    public Page<tracker> getAllTrackerPages(int page, int size){
        Pageable pg= PageRequest.of(page,size);
        return tr.findAll(pg);
    }
}
