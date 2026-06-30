package com.Backend.BackendDemo.Service;
import com.Backend.BackendDemo.Exception.trackerNotFoundException;
import com.Backend.BackendDemo.Repository.trackerRepository;
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
    @Autowired
    private mailServices mailService;

    public tracker createTracker(tracker t){
        tracker track= tr.save(t);
        mailService.sendMail(track.getEmail());
        return track;
    }
    public List<tracker> getAllTrackers(){
        return tr.findAll();
    }
    public tracker getTracker(int id){
        return tr.findById(id).orElseThrow(()-> new trackerNotFoundException("Tracker with id "+id+" not found"));
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
    public String forgotPassword(String email){
        tracker track=tr.findByEmail(email).orElseThrow(()-> new trackerNotFoundException("Email not found"));
        mailService.sendOTP(email);
        return "OTP sent successfully";
    }
}
