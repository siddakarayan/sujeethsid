package com.dao;

import java.util.List;


import com.model.Product;

public interface Productdao {
	

	List<Product> Productlist();
	public void update(Product product);
	
public void delete(int pid);

public void insert(Product product);
public void edit(Product pid);
public Product getproductsbyid(int pid);
public List<Product> getproductsbyid(String category);

}
