package com.example.usermanagementsystem.LoginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/random")
@EnableScheduling
public class LoginController {

    @GetMapping("/no")
    @Scheduled(fixedRate = 2000)
    public long returnRandom(){
        long x = new Random().nextInt(10);
        System.out.println("random number is "+x);
        return x;
    }
}
