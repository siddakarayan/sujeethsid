package com.dao;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model2.Userchat;
@Repository("userdao")
public class DAOimple implements Userdao {

	@Autowired
	 private SessionFactory sessionFactory;
	    
	   
	    public SessionFactory getSessionFactory() {
	return sessionFactory;
}
public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}



		@Transactional
		public void save(Userchat user){
	    	Session session=sessionFactory.openSession();
		    System.out.println("inside save method");
	    	session.save(user);
	    	session.flush();
	}
		
		
	    @Transactional
		public void update(Userchat user) {
			
			Session session=sessionFactory.getCurrentSession();
			session.update(user);
			session.flush();
		}
	  /*  
	    
	    @Transactional
	   	public void delete(Userchat user) {
	   		// TODO Auto-generated method stub
	   		Session session=sessionFactory.getCurrentSession();
	   		session.delete(user);
	   		session.flush();
	   		
	   	}
	    
	 @Transactional
		public  List<Userchat> getUser(String email,String password) {
	   		// TODO Auto-generated method stub
	   		Session session=sessionFactory.getCurrentSession();
	   		Criteria criteria=session.createCriteria(Userchat.class);
	   		System.out.println(email+"   "+password);
	   		//User u=(User)session.get(User.class,email);
	   		criteria.add((Restrictions.eq("email",email)));
	               criteria.add((Restrictions.eq("password",password)));
	               //criteria.add(Restrictions.and(Restrictions.eq("email",email), Restrictions.eq("password",password)));
	   		//System.out.println(u.getPassword()+"---pass");
			List<Userchat> list = criteria.list();
			System.out.println(list);
			
		return  list;

	   		
	   		
	   	}
	   
	*/
}
