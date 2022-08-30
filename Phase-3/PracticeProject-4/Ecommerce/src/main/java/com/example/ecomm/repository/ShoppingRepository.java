package com.example.ecomm.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.ecomm.entity.ShoppingCart;

public interface ShoppingRepository extends CrudRepository<ShoppingCart, Integer>{

}
