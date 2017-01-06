package com.Noideacontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dao2.daoimple2;
import com.model2.customer;

@RestController
public class Controller {

	@Autowired
	private daoimple2 sdao;
		
		@RequestMapping(value="/register/{name}",method=RequestMethod.POST)
				public ResponseEntity<customer> signup(@PathVariable String name){
			
			customer custom=new customer();
			sdao.save(custom);
			
			return new ResponseEntity<customer>(custom,HttpStatus.OK);
		 
		
		}
		
	}
