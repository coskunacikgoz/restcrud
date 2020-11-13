package com.example.restcrud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.restcrud.dao.ProductsDAO;
import com.example.restcrud.entity.Products;

@Service
public class ProductsServiceImp implements ProductService{
    private ProductsDAO productsDAO;

    @Autowired
    public ProductsServiceImp(ProductsDAO myProductsDAO){
        productsDAO=myProductsDAO;
    }

    @Override
    @Transactional
    public List<Products> showAll(){
        return productsDAO.showAll();
    }

    @Override
    @Transactional
    public Products showById(int pId){
        return productsDAO.showById(pId);
    }

    @Override
    @Transactional
    public void save(Products products){
        productsDAO.save(products);
    }

    @Override
    @Transactional
    public void deleteById(int pId){
        productsDAO.deleteById(pId);
    }
}
