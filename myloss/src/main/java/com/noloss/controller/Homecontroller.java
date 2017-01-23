package com.noloss.controller;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.DAOimple;
import com.dao.Userdao;
import com.model2.Userchat;

@Controller
public class Homecontroller {
	
	//@Autowired
	 private Userdao userdao;
	 

	 
	 
	 //@SuppressWarnings("unused")
	public Homecontroller()
{
	try
		 {
	@SuppressWarnings("resource")
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
   context.scan("com.niit.mylossconfig");
   System.out.println("config");
   context.refresh();
   userdao=(Userdao)context.getBean("disco");
	 }
		 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
}
	@RequestMapping(value="/Sign/{name}/{email}/{password}/{address}/{state}/{city}/{mobile}/",method=RequestMethod.POST,headers="Accept=application/json")
			public ResponseEntity<Userchat> Sign(@PathVariable String name,@PathVariable String email,@PathVariable String password,
					@PathVariable String address,@PathVariable String state,@PathVariable String city,@PathVariable String mobile ){
		
		System.out.println("inside register");
		Userchat us=new Userchat();
		
		us.setName(name);
		us.setEmail(email);
		us.setPassword(password);
		us.setAddress(address);
		us.setState(state);
		us.setCity(city);
		us.setMobile(mobile);
		
       userdao.save(us);
       
   	System.out.println(name +"  "+"name,email,password,address,state,city,mobile");
		return new ResponseEntity<Userchat>(HttpStatus.OK);
	}
	
		@RequestMapping(value="/Login/{email}/{password}",method=RequestMethod.POST,headers="Accept=application/json")

		public ResponseEntity<Userchat> Login(@PathVariable String email,@PathVariable String password){
		System.out.println("controller");
		List<Userchat> Userchat=new ArrayList<Userchat>();
		Userchat = userdao.getUser(email, password);
		if(Userchat.isEmpty())
		{
		System.out.println("invalid details");
		return new ResponseEntity<Userchat>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		else
		{
		System.out.println("valid details");
	    return new ResponseEntity<Userchat>(HttpStatus.OK);
	
		}
	
		
	}
}
	


	

