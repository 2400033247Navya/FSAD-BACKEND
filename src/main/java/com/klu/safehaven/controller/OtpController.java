package com.klu.safehaven.controller;

import com.klu.safehaven.service.OtpService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/otp")
@CrossOrigin("*")
public class OtpController {

    private final OtpService otpService;

    public OtpController(OtpService otpService) {
        this.otpService = otpService;
    }

    @PostMapping("/send")
    public String sendOtp(@RequestParam String mobile) {
        return otpService.sendOtp(mobile);
    }

    @PostMapping("/verify")
    public String verifyOtp(@RequestParam String otp) {
        return otpService.verifyOtp(otp);
    }
}