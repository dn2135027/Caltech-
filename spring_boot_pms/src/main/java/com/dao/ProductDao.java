package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Product;
@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{
	
}