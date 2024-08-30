package com.entity;

public class UserInput {
    private String name;
    private String email;

    public UserInput(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
