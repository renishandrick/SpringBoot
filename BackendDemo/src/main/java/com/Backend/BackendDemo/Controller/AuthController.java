package com.Backend.BackendDemo.Controller;

import com.Backend.BackendDemo.Security.JwtUtil;
import com.Backend.BackendDemo.dto.LoginRequest;
import com.Backend.BackendDemo.dto.LoginResponse;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
public class AuthController {
    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;
    @PostMapping("/Login")
    public LoginResponse login(@RequestBody LoginRequest request){
        authenticationManager.authenticate{
            new UsernamePasswordAuthenticationToken(request.getEmail(),
                request.getPassword));
        String token = jwtUtil.generateToken(request.getEmail());
        return new LoginResponse(token);
        }
    }
}
