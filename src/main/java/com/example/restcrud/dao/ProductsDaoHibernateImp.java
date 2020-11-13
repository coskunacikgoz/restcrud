package com.example.restcrud.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.restcrud.entity.Products;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ProductsDaoHibernateImp implements ProductsDAO{
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Products> showAll(){
        Session currentSession=entityManager.unwrap(Session.class);
        Query<Products> myQuery=currentSession.createQuery("from Products", Products.class);
        List<Products> products=myQuery.getResultList();
        return products;
    }
    @Override
    public Products showById(int pId){
        Session currentSession=entityManager.unwrap(Session.class);
        Products products=currentSession.get(Products.class, pId);
        return products;
    }
    @Override
    public void save(Products products){
        Session currentSession=entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(products);
    }
    @Override
    public void deleteById(int pId){
        Session currentSession=entityManager.unwrap(Session.class);
        Query myQuery=currentSession.createQuery("delete from Products where id=:ProductID");
        myQuery.setParameter("ProductID", pId);
        myQuery.executeUpdate();
    }
}
