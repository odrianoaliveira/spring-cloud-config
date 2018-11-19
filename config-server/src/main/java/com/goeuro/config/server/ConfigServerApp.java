package com.goeuro.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.monitor.GithubPropertyPathNotificationExtractor;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigServer
@EnableAutoConfiguration
@SpringBootApplication
public class ConfigServerApp {

    @Bean
    public GithubPropertyPathNotificationExtractor githubPropertyPathNotificationExtractor() {
        return new GithubPropertyPathNotificationExtractor();
    }

    public static void main(String[] arguments) {
        SpringApplication.run(ConfigServerApp.class, arguments);
    }
}
