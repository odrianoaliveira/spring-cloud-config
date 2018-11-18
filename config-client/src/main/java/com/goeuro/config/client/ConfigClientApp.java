package com.goeuro.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RefreshScope // <= auto refresh configuration
@RestController
@SpringBootApplication
public class ConfigClientApp {
    @Value("${user.role}")
    private String role;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApp.class, args);
    }

    @GetMapping(value = "/whoami/{username}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String whoami(@PathVariable("username") String username) {
        return String.format("Hello! You're %s and you'll become a(n) %s...%n", username, role);
    }
}
