package com.codeair.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codeair.app.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}