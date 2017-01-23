package com.myloss.controllerbckend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.Userdao;
import com.model2.Userchat;

public class App2 {
@Autowired
	public static void main( String[] args )
    {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext appobj = new AnnotationConfigApplicationContext();
		appobj.scan("com.niit.mylossconfig");
		
		appobj.refresh();
      System.out.println("check");
      
		Userdao cd=(Userdao)appobj.getBean("disco");
		 
       Userchat add = new Userchat();
      
        add.setName("siddak");
        add.setPassword("1234567");
         add.setEmail("rrrjj");
         add.setAddress("hki");
         add.setState("uuuzz");
         add.setCity("jkkkj");
         add.setMobile("987654");
         
       //  cd.save(add);
         cd.update(add);
        // cd.delete(add);
         System.out.println("woo");
    
    }
}



