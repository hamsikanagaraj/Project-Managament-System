package com.mit.pojo;

import java.util.List;
import java.util.Optional;

public interface ProductDao {

    boolean save(Product p);

    Optional<Product> findByCode(int code);

    List<Product> listAll();

    List<Product> findByPriceRange(double min, double max);

    boolean delete(int code);
}