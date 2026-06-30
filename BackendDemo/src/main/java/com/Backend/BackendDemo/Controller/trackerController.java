package com.Backend.BackendDemo.Controller;
import com.Backend.BackendDemo.entites.tracker;
import com.Backend.BackendDemo.Service.trackerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/track")
public class trackerController {
    @Autowired
    private trackerService ts;
    @PostMapping("/create")
    ResponseEntity createUser (@Valid @RequestBody tracker t){
        return new ResponseEntity<>(ts.createTracker(t), HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public List<tracker> getAll(){
        return ts.getAllTrackers();
    }
    @GetMapping("/{id}")
    public tracker getById(@PathVariable int id){
        return ts.getTracker(id);
    }
    @PutMapping("/update")
    public tracker update(@PathVariable tracker t){
        return ts.updateTracker(t);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return ts.deleteTracker(id);
    }
    @GetMapping("/page")
    public Page<tracker> getAllPages(@RequestParam int page, @RequestParam int size){
        return ts.getAllTrackerPages(page, size);
    }
    @PostMapping("/forgot-password")
    public ResponseEntity<String> forgotPassword(@RequestParam String email){
        return ResponseEntity.ok(ts.forgotPassword(email));
    }
}
