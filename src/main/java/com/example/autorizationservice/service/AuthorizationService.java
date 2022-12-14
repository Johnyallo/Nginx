package com.example.autorizationservice.service;

import com.example.autorizationservice.authorities.Authorities;
import com.example.autorizationservice.repository.UserRepository;
import com.example.autorizationservice.exceptions.InvalidCredentials;
import com.example.autorizationservice.exceptions.UnauthorizedUser;
import com.example.autorizationservice.user.User;
import org.springframework.stereotype.Service;

import java.util.List;


public class AuthorizationService {
    UserRepository userRepository;

    public AuthorizationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(String user, String password) {
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
