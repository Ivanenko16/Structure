package com.company.infrastructure.data;

public interface UserDataMapper {

    User findByEmail(String email);
    User findByUsername(String username);
}
