package com.example.restcrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")

public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID")
    private int ProductID;

    @Column(name = "ProductName")
    private String ProductName;

    @Column(name = "UnitPrice")
    private Double UnitPrice;

    @Column(name = "UnitsInStock")
    private int UnitsInStock;

    public Products(){

    }
    public Products(String ProductName, Double UnitPrice, int UnitsInStock){
        this.ProductName=ProductName;
        this.UnitPrice=UnitPrice;
        this.UnitsInStock=UnitsInStock;
    }
    public int getProductID(){
        return ProductID;
    }
    public void setProductID(int ProductID){
        this.ProductID=ProductID;
    }
    public String getProductName(){
        return ProductName;
    }
    public void setProductName(String ProductName){
        this.ProductName=ProductName;
    }
    public Double getUnitPrice(){
        return UnitPrice;
    }
    public void setUnitPrice(Double UnitPrice){
        this.UnitPrice=UnitPrice;
    }
    public int getUnitsInStock(){
        return UnitsInStock;
    }
    public void setUnitsInStock(int UnitsInStock){
        this.UnitsInStock=UnitsInStock;
    }

    @Override
    public String toString() {
        return "Products [ProductID=" + ProductID + ", ProductName="+ProductName+", UnitPrice="+UnitPrice+
                ", UnitsInStock="+UnitsInStock+" ]";
    }
}
