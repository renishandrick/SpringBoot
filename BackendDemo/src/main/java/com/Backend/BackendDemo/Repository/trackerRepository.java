package com.Backend.BackendDemo.Repository;

import com.Backend.BackendDemo.entites.tracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface trackerRepository extends JpaRepository<tracker,Integer> {
    Optional<tracker> findByEmail(String email);
}
