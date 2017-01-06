package com.dao2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model2.customer;

@Repository("Userdao2")

public class daoimple2 implements Userdao2 {
	
	    @Autowired
	    private SessionFactory sessionFactory;
	    
	    
	    
	    public SessionFactory getSessionFactory() {
			return sessionFactory;
		}
		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
		public  daoimple2(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
	    @Transactional
		public void save(customer user){
	    	Session session=sessionFactory.openSession();
	        session.save(user);
	        session.flush();
	        session.close();
	}


}
