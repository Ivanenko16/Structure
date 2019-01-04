package com.company.infrastructure.data;

public class UserNotFoundException  extends RuntimeException {
    public UserNotFoundException() {
        super("User was not found");
    }
}
