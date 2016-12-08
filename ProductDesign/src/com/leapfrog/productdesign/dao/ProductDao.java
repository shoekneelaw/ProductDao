/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.productdesign.dao;

import com.leapfrog.productdesign.entity.Product;
import java.util.List;

/**
 *
 * @author user
 */
public interface ProductDao {
    boolean insert(Product p);
    List<Product> getall();
    boolean delete(int id);
    Product getById(int id);
    List<Product> search(String parameter);
}
