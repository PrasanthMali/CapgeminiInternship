package com.cg.fms.service;

import java.util.List;

import com.cg.fms.entity.Product;

public interface ProductService {
	public Product getProduct(String productId);

	public Product addProduct(Product product);

	public Product updateProduct(Product product);

	public Product deleteProduct(String productId);
	
	public List<Product> getAllProducts();
}
