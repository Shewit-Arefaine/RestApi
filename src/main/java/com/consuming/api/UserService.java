package com.consuming.api;

import java.util.List;

public class UserService {
    private UserRepo userRepo =new UserRepo();
    public void addUser(User user){
        userRepo.adduser(user);
    }
    public List<User> getUser(){
        return userRepo.getUsers();
    }
}
