package com.mit.service;

import java.util.List;

import com.mit.pojo.InvalidProductException;
import com.mit.pojo.Product;
import com.mit.pojo.ProductDao;
import com.mit.pojo.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {

    private ProductDao dao;

    public ProductServiceImpl() {
        dao = new ProductDaoImpl();
    }

    @Override
    public boolean save(Product p) {
        return dao.save(p);
    }

    @Override
    public Product findByCode(int code)
            throws InvalidProductException {

        return dao.findByCode(code)
                .orElseThrow(() ->
                        new InvalidProductException(
                                "Product not found with code: " + code
                        )
                );
    }

    @Override
    public List<Product> listAll() {
        return dao.listAll();
    }

    @Override
    public List<Product> findByPriceRange(double min, double max) {
        return dao.findByPriceRange(min, max);
    }

    @Override
    public boolean delete(int code)
            throws InvalidProductException {

        if (!dao.delete(code)) {

            throw new InvalidProductException(
                    "Product not found with code: " + code
            );
        }

        return true;
    }
}