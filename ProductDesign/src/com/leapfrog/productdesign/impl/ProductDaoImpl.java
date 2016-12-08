/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.productdesign.impl;

import com.leapfrog.productdesign.dao.ProductDao;
import com.leapfrog.productdesign.entity.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ProductDaoImpl implements ProductDao {

    List<Product> pdList = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    @Override
    public boolean insert(Product p) {
        return pdList.add(p);
    }

    @Override
    public List<Product> getall() {
        return pdList;
    }

    @Override
    public Product getById(int id) {
        for (Product p : pdList) {
            if (p.getId() == id) {
                return p;
            }

        }
        return null;
    }

    @Override
    public List<Product> search(String parameter) {
        List<Product> searchList = new ArrayList<>();
        for (Product p : pdList) {
            if (p.getProdtuctName().contains(parameter)) {
                searchList.add(p);
            }
        }

        return searchList;

    }

    @Override
    public boolean delete(int id) {
        Product p = getById(id);

        if (p != null) {
            System.out.println("Do you really want to delete" + p.getProdtuctName() + "\t" + "from list[Y/N]");
            if (input.next().equalsIgnoreCase("y")) {
                return pdList.remove(p);
            }

            return false;
        }
        return false;
    }
}
