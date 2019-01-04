package com.company.infrastructure.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class FileUserDataMapper implements UserDataMapper {

    private ArrayList<User> users = new ArrayList<User>();

    public FileUserDataMapper() {
        try {
            File file = new File("users.txt");
            BufferedReader br = new BufferedReader(new FileReader("users.txt"));

            String st;
            while ((st = br.readLine()) != null) {

                String parts[] = st.split(",");
                users.add(new User(parts[0], parts[1], parts[2]));
            }


        } catch (Exception ex) {
            throw new RuntimeException("User were not read from file");
        }
    }

    public ArrayList<User> getAll() {
        return users;
    }

    @Override
    public User findByEmail(String email) {
        for (User u : users) {
            if (u.getEmail().equals(email))
                return u;
        }
        throw new UserNotFoundException();

    }

    @Override
    public User findByUsername(String username) {
        for (User u : users) {
            if (u.getUsername().equals(username))
                return u;
        }
        throw new UserNotFoundException();
    }
}