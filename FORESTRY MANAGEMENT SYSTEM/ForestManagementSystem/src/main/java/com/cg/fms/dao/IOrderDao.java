package com.cg.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.entity.Order;

public interface IOrderDao extends JpaRepository<Order, String>{


}