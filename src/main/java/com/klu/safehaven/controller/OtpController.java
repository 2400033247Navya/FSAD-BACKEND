package com.klu.safehaven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class OtpController {

    @Autowired
    private JavaMailSender mailSender;

    private Map<String, String> otpStorage = new HashMap<>();

    public String sendOtp(String email) {
        String otp = String.valueOf(new Random().nextInt(900000) + 100000);

        otpStorage.put(email, otp);

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("SafeHaven OTP Verification");
        message.setText("Your OTP is: " + otp);

        mailSender.send(message);

        return "OTP sent successfully";
    }

    public String verifyOtp(String email, String otp) {
        String storedOtp = otpStorage.get(email);

        if (storedOtp != null && storedOtp.equals(otp)) {
            otpStorage.remove(email);
            return "OTP Verified Successfully";
        }

        return "Invalid OTP";
    }
}