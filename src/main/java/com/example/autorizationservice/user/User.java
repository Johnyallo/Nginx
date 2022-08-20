package com.example.autorizationservice.user;

import java.util.Objects;

public class User {
    private final String user;

    private final String password;

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return user;
    }
}
