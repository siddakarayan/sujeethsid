package com.dao;

import java.util.List;

import com.model2.Userchat;

public interface Userdao {

	 public void save(Userchat user);
	   public void update(Userchat user);
	    public void delete(Userchat user);
	    public  List<Userchat> getUser(String email,String password);
	
}
