package com.Backend.BackendDemo;

import com.Backend.BackendDemo.entites.tracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface trackerRepository extends JpaRepository<tracker,Integer> {

}
