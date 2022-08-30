package com.example.productservice.exceptions;

public class ProductNotFoundException extends RuntimeException{

	public ProductNotFoundException(String id) {
		super("Product with id " + id + "is not Found.Pls Give another id!!");
	}

	public ProductNotFoundException(int id) {
		super("Product with id " + id + "is not Found.Pls Give another id!!");
	}

}
