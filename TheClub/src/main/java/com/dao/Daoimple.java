package com.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Customer;
 
@Repository
public class Daoimple  implements Userdao {
    @Autowired
    private SessionFactory sessionFactory;
    
    public Daoimple(){
    	
    }
    public  Daoimple(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
    
   
   
	@Transactional
	public void save(Customer user) {
		
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
		session.flush();
	}
    
   	}
   

