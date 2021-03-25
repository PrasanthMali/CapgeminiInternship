package com.cg.fms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.fms.entity.Product;
import com.cg.fms.model.CustomerModel;
import com.cg.fms.model.LandModel;
import com.cg.fms.model.ProductModel;
@Service
public class ProductServiceImpl implements ProductService {

	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Product getProduct(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product deleteProduct(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<LandModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public ProductModel findById(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean existsByProductNumber(String productId) {
		// TODO Auto-generated method stub
		return false;
	}

}
