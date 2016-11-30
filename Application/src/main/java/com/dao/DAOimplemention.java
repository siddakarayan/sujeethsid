package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;
 
@Repository("userdao")
public class DAOimplemention  implements Userdao {
    @Autowired
    private SessionFactory sessionFactory;
    
    public DAOimplemention(){
    	
    }
    public  DAOimplemention(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
    @Transactional
	public void save(User user){
    	Session session=this.sessionFactory.getCurrentSession();
    	user.setEnabled(true);
    	user.setRole("USERROLE");
	session.save(user);
}
    @Transactional
	public void update(User user) {
		
		Session session=sessionFactory.getCurrentSession();
		session.update(user);
		session.flush();
	}
    @Transactional
   	public void delete(User user) {
   		// TODO Auto-generated method stub
   		Session session=sessionFactory.getCurrentSession();
   		session.delete(user);
   		session.flush();
   		
   	}
 @Transactional
	public  List<User> getUser(String email,String password) {
   		// TODO Auto-generated method stub
   		Session session=sessionFactory.getCurrentSession();
   		Criteria criteria=session.createCriteria(User.class);
   		criteria.add((Restrictions.eq("email",email)));
               criteria.add((Restrictions.eq("password",password)));
		List<User> list = criteria.list();
		System.out.println(list);
		
	return  list;

   		
   		
   	}
   
}