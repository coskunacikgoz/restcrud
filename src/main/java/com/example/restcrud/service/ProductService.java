package com.example.restcrud.service;

import java.util.List;
import com.example.restcrud.entity.Products;

public interface ProductService {

    List<Products> showAll();

    Products showById(int pId);

    void save(Products products);

    void deleteById(int pId);
}
