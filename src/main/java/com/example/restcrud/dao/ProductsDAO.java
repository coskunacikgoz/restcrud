package com.example.restcrud.dao;

import java.util.List;
import com.example.restcrud.entity.Products;

public interface ProductsDAO {
    List<Products> showAll();

    Products showById(int pId);

    void save(Products products);

    void deleteById(int pId);
}
