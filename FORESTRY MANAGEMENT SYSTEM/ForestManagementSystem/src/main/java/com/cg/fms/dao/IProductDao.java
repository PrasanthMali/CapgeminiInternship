package com.cg.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.entity.Product;


public interface IProductDao extends JpaRepository<Product, String>{

}
