package com.mit.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductDaoImpl implements ProductDao {

    private List<Product> products;

    public ProductDaoImpl() {
        products = new ArrayList<>();
    }

    @Override
    public boolean save(Product p) {
        return products.add(p);
    }

    @Override
    public Optional<Product> findByCode(int code) {

        return products.stream()
                .filter(p -> p.getCode() == code)
                .findFirst();
    }

    @Override
    public List<Product> listAll() {
        return products;
    }

    @Override
    public List<Product> findByPriceRange(double min, double max) {

        return products.stream()
                .filter(p -> p.getPrice() >= min &&
                             p.getPrice() <= max)
                .toList();
    }

    @Override
    public boolean delete(int code) {

        Optional<Product> product =
                products.stream()
                        .filter(p -> p.getCode() == code)
                        .findFirst();

        if (product.isPresent()) {
            products.remove(product.get());
            return true;
        }

        return false;
    }
}