package com.consuming.api;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {

    private List newArrayList=new ArrayList<>();

    public void adduser(User user){
        newArrayList.add(user);
    }
    public List<User> getUsers(){
        return newArrayList;
    }
}
