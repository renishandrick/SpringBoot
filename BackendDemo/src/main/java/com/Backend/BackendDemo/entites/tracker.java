package com.Backend.BackendDemo.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Data
public class tracker {
    @Id
    @GeneratedValue
    int id;
    @NotBlank
    String name;
    String batch;
    @Email
    String email;
    @Pattern(regexp = "^[6-9]\\d{9}$")
    String mobile;
}
