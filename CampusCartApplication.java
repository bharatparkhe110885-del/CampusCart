package com.campuscart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CampusCartApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampusCartApplication.class, args);
    }

    @GetMapping("/api/status")
    public String status() {
        return "CampusCart is running successfully!";
    }
}
