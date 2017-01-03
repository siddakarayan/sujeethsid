package com.screambackendcontroler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.dao.Userdao;

import com.model.Customer;

public class App {

	public static void main( String[] args )
    {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext appobj = new AnnotationConfigApplicationContext();
		appobj.scan("com.scream.applicationconfig");
		
		appobj.refresh();

		Userdao ud=(Userdao)appobj.getBean("me");
		
		
		 
        Customer add = new Customer();
      
        add.setUsername("aa");
        add.setPassword("r4");
         add.setEmail("audi");
         add.setAddress("eee");
         add.setState("tn");
         add.setCity("chennai");
         add.setMobile("97911");
         ud.save(add);
        
	   
       
     //   ud.update(add);
        
    //   ud.delete(add);
	
    }

}
