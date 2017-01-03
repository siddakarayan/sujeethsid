package com.Italianfrontend.controller.lambobackend;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.dao.Productdao;
import com.dao.Userdao;
import com.model.Product;
import com.model.User;

public class App 
{
   
	
	public static void main( String[] args )
    {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext appobj = new AnnotationConfigApplicationContext();
		appobj.scan("com.niit.application");
		
		appobj.refresh();

		Userdao ud=(Userdao)appobj.getBean("udao");
		 Productdao pd=(Productdao)appobj.getBean("pdao");
		
		 
        User add = new User();
      
        add.setUsername("aa");
        add.setPassword("r4");
         add.setEmail("audi");
         add.setAddress("eee");
         add.setState("tn");
         add.setCity("chennai");
         add.setMobile("97911");
         ud.save(add);
        
		 Product add1=new Product();
		 add1.setProductid(1);
		 add1.setProductname("galado");
     	add1.setProductdetails("avaliale");
     	add1.setProductprice("1230000");
     	 
       
        
        	pd.insert(add1);
        	
       pd.update(add1);
       
      pd.delete(1);
       
       ud.save(add);
        ud.update(add);
        
      //  ud.delete(obj);
	
    }
}

