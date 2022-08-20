package com.example.autorizationservice.repository;

import com.example.autorizationservice.authorities.Authorities;
import com.example.autorizationservice.user.User;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {
    private final Map<User, List<Authorities>> userMap = new HashMap<>();
    User user1 = new User("admin", "admin");

    public UserRepository() {
        addUserAuthorities(user1, Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE));
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        return userMap.get(user1);
    }

    public void addUserAuthorities(User user, List<Authorities> list) {
        userMap.put(user, list);
    }



}
