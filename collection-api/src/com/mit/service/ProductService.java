package com.mit.service;

import java.util.List;

import com.mit.pojo.InvalidProductException;
import com.mit.pojo.Product;

public interface ProductService {

    boolean save(Product p);

    Product findByCode(int code) throws InvalidProductException;

    List<Product> listAll();

    List<Product> findByPriceRange(double min, double max);

    boolean delete(int code) throws InvalidProductException;
}