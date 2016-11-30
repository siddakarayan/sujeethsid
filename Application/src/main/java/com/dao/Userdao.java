package com.dao;

import java.util.List;

import com.model.User;

public interface Userdao {
    
     
    public void save(User user);
    public void update(User user);
     public void delete(User user);
     public  List<User> getUser(String email,String password);
}