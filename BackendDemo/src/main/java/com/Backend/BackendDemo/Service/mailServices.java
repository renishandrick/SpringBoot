package com.Backend.BackendDemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import java.util.Random;

@Service
public class mailServices {
    @Autowired
    private JavaMailSender mailSender;
    HashMap<String,String> otpStorage=new HashMap<>();
    public void sendMail(String to){
        SimpleMailMessage mail=new SimpleMailMessage();
        mail.setTo(to);
        mail.setSubject("welcome tp springboot session");
        mail.setText("hello.\n springboot session");
        mailSender.send(mail);
    }
    public String generateOTP(){
        Random r=new Random();
        int otp=100000+r.nextInt(900000);
        return String.valueOf(otp);
    }
    public void sendOTP(String email){
        String otp=generateOTP();
        otpStorage.put(email,otp);
        SimpleMailMessage mail=new SimpleMailMessage();
        mail.setTo(email);
        mail.setSubject("OTP Verification");
        mail.setText("Your OTP is : "+otp);
        mailSender.send(mail);
    }
}
