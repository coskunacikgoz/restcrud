package com.example.restcrud.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restcrud.dao.ProductsDAO;
import com.example.restcrud.service.ProductService;
import com.example.restcrud.entity.Products;

@RestController
@RequestMapping("/products")

public class ProductsRestController {
    private ProductService productService;
    @Autowired
    public ProductsRestController(ProductService myProductsService){
        productService=myProductsService;
    }
    @GetMapping("/all")
    public List<Products> showAll(){
        return productService.showAll();
    }
    @GetMapping("/id/{ProductID}")
    public Products getProducts(@PathVariable int ProductID){
        Products products=productService.showById(ProductID);

        return products;
    }
    @PostMapping("/add")
    public Products addProducts(@RequestBody Products products){
        productService.save(products);
        return products;
    }
    @PutMapping("/update")
    public Products updateProducts(@RequestBody Products products){
        productService.save(products);
        return products;
    }
    @DeleteMapping("/delete/{ProductID}")
    public String deleteProducts(@PathVariable int ProductID){
        productService.deleteById(ProductID);
        return "ProductID "+ProductID+" deleted.";
    }
}
