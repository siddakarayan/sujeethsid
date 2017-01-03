package com.scream.applicationconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.dao.Daoimple;


import com.dao.Userdao;

import com.model.Customer;

@Configuration
@ComponentScan("com.model")
@EnableTransactionManagement

public class ScreamContextConfig {
	
	@Bean(name = "dataSource")
	   public DataSource getDataSource() {
	       BasicDataSource dataSource = new BasicDataSource();
	       dataSource.setDriverClassName("org.h2.Driver");
	       dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
	       dataSource.setUsername("SUJEETH");
	       dataSource.setPassword("123");
	    	       return dataSource;
	   }
	@Autowired
	   @Bean (name="sessionFactory")
	   public SessionFactory getSessionFactory(DataSource dataSource) {
	      LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	     sessionBuilder.addProperties(getHibrnateProperties());
	     System.out.println("before");
	     sessionBuilder.addAnnotatedClasses(Customer.class);
	     System.out.println("after");
		return null;
	  	     
	   }
	 
	   
	   private Properties getHibrnateProperties() {
		 
		   Properties properties = new Properties();
		   System.out.println("hellooooo");
		   properties.put("hibernate.show-sql", "true");
		   properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		   properties.put("hibernate.hbm2ddl.auto", "create");
		     
		return properties;
	}
	   
	@Autowired
	   @Bean(name = "transactionManager")
	
	   public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
	       HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
	       System.out.println("welcome");
	       return transactionManager;
	   }
	
	@Autowired
	  @Bean(name = "me")
	
	  public Userdao getUserdao(SessionFactory factory)
	 {
		  return new Daoimple(factory);
	  
	  }
	 
}


	  
	






