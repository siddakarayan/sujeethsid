package com.applicationconfig2;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.dao2.Userdao2;
import com.dao2.daoimple2;
import com.model2.customer;

@Configuration
@ComponentScan("com.model2")
@EnableTransactionManagement

public class Applicationcontextconfig2 {
	
	@Bean(name = "dataSource")
	   public DataSource getDataSource() {
	       BasicDataSource dataSource = new BasicDataSource();
	       dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
	       dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
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
	     sessionBuilder.addAnnotatedClasses(customer.class);
	     System.out.println("after");
	     
	 	 	      return sessionBuilder.buildSessionFactory();
	   }
	 
	   
	   
	   private Properties getHibrnateProperties() {
		 
		   Properties properties = new Properties();
		   System.out.println("hellooooo");
		   properties.put("hibernate.show-sql", "true");
		   properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		   properties.put("hibernate.hbm2ddl.auto", "update");
		   
		   
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
	@Bean(name="sdao")
	public Userdao2 getUserdao2(SessionFactory factory){
		return new daoimple2(factory);
	}
	  
	} 






