package com.example.autorizationservice.user;

import com.example.autorizationservice.repository.UserRepository;
import com.example.autorizationservice.service.AuthorizationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;


@Configuration
public class User {
    @Bean
    public AuthorizationService service(UserRepository repository) {
        return new AuthorizationService(repository);
    }
}
