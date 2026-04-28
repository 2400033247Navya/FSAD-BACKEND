package com.klu.safehaven.service;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class OtpService {

    private String generatedOtp;

    public String sendOtp(String mobile) {
        generatedOtp = String.valueOf(100000 + new Random().nextInt(900000));

        System.out.println("OTP for " + mobile + " is: " + generatedOtp);

        return generatedOtp; // demo purpose only
    }

    public String verifyOtp(String otp) {
        if (generatedOtp != null && generatedOtp.equals(otp)) {
            return "OTP verified successfully";
        }
        return "Invalid OTP";
    }
}