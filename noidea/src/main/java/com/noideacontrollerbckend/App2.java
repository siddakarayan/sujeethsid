package com.noideacontrollerbckend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao2.Userdao2;
import com.model2.customer;

public class App2 {
	
	
	public static void main( String[] args )
    {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext appobj = new AnnotationConfigApplicationContext();
		appobj.scan("com.applicationconfig2");
		System.out.print("aaaaaaa");
		
		appobj.refresh();
		

		Userdao2 ud=(Userdao2)appobj.getBean("sdao");
		System.out.print("bbbbbbbbb");
		 
		
		 
        customer add = new customer();
      
        add.setUsername("aa");
        add.setPassword("r4");
         add.setEmail("audi");
         add.setAddress("eee");
         add.setState("tn");
         add.setCity("chennai");
         add.setMobile("97911");
         ud.save(add);
    }
}
        
		
        
        	
	
	
	


