package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class DbUser {
    private List<User> userList=new ArrayList<>();
    public DbUser()
    {
        userList.add(new User(1,"Ayush",30));
        userList.add(new User(2,"Abhay",40));
    }

    public List<User> getAllUser()
    {
        return userList;
    }

    public User getUser(int id)
    {
        for (User user:userList) {
            if (user.getId()==id)
            {
                return user;
            }
        }
        return null;
    }

    public User getUserByName(String name) {
        for (User user:userList) {
            if (user.getName().equals(name))
            {
                return user;
            }
        }
        return null;
    }

    public User addUser(User user) {
        userList.add(user);
        return user;
    }

    public String deleteUser(int id)
    {
        for (User user:userList) {
            if (user.getId()==id)
            {
                userList.remove(id);
                return "User Deleted SuccessFully";
            }
        }
        return "User Not Found";
    }
}
