package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
	import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;

import com.model.Product;

	@Repository("pdao")

	public class Productdaoimpl implements Productdao {
		@Autowired
	    private SessionFactory sessionFactory;
		private SessionFactory sessionfactory;
	    public SessionFactory getSessionFactory(){
	    	return sessionFactory;
	    }
	    public void setSessionFactory(SessionFactory sessionFactory){
	    	this.sessionFactory=sessionFactory;
	    }
	   
	    @Transactional
	
	      public void insert(Product product){
			Session session=sessionFactory.openSession();
			session.save(product);
			session.flush();
		}
	    
	   @Transactional
	   public void update(Product product){
			Session session=sessionFactory.getCurrentSession();
			session.update(product);
			session.flush();
			
	    }
		  @Transactional

	public void delete(int pid) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class,pid);
		session.delete(product);
		session.flush();
		  	
		  }
	@Transactional
	public List<Product> Productlist(){
		
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Product> Productlist=session.createQuery("from Product").list();
		return Productlist;
	}
	
	@Transactional
	public Product getproductsbyid(int pid){
		
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unused")
		Product product=(Product)session.get(Product.class,pid);
		
		return product;
	}
	
	@Transactional
	public void edit(Product pid){
		Session session=sessionfactory.openSession();
		session.update(pid);
		session.flush();
		session.close();
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	
	public List<Product> getproductsbyid(String productcategory){
		
		Session session= this.sessionFactory.getCurrentSession();
		
		Criteria criteria=session.createCriteria(Product.class);
		criteria.add(Restrictions.eq("productcategory",productcategory));
		List<Product> list2=criteria.list();
		System.out.println(list2);
		return list2;
	}
	}
	

