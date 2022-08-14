package com.example.autorizationservice.repository;

import com.example.autorizationservice.authorities.Authorities;
import com.example.autorizationservice.user.User;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {
    private final Map<User, List<Authorities>> userMap = new ConcurrentHashMap<>();

    public UserRepository() {
        addUserAuthorities(new User("admin", "admin"), Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE));
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        return userMap.get(user);
    }

    public void addUserAuthorities(User user, List<Authorities> authoritiesList) {
        userMap.put(user, authoritiesList);
    }
}
