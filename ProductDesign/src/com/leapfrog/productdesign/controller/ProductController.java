/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.productdesign.controller;

import com.leapfrog.productdesign.dao.ProductDao;
import com.leapfrog.productdesign.entity.Product;
import com.leapfrog.productdesign.impl.ProductDaoImpl;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ProductController {

    private Scanner input;
    private ProductDao product;

    public ProductController(Scanner input, ProductDao product) {
        this.input = input;
        this.product = product;
    }

    private void menu() {

        System.out.println("1. Add Product");
        System.out.println("2. Delete Product");
        System.out.println("3. Get by id");
        System.out.println("4. Show all");
        System.out.println("5. search");
        System.out.println("6. Export to text file");
        System.out.println("7. exit");
        

    }

    private void addView() {
        while (true) {
            Product p = new Product();
            System.out.println("Enter the id ");
            p.setId(input.nextInt());
            System.out.println("Enter the product name");
            p.setProdtuctName(input.next());
            System.out.println("Enter the Cost Price");
            p.setCostPrice(input.nextDouble());
            System.out.println("Enter the sell Price");
            p.setSellPrice(input.nextDouble());
            System.out.println("Enter the quantity");
            p.setQuantity(input.nextInt());
            System.out.println("Enter the status");
            p.setStatus(input.nextBoolean());
            product.insert(p);
            System.out.println("Do you Want to add more: [Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
               break;
            }

        }

    }

    private void showAllView() {
        System.out.println("=============Product Description=============");
        System.out.println("Id\t\t" + "Product name\t\t" + "quantity\t\t" + "Status\t\t");
        for (Product p : product.getall()) {
            System.out.println(p.getId() + "\t\t" + p.getProdtuctName() + "\t\t\t" + p.getQuantity() + "\t\t\t" + p.isStatus());
        }

    }

    private void removeView() {

        System.out.println("Enter the id to delete");
        product.delete(input.nextInt());
        showAllView();

    }

    private void getByIdView() {

        System.out.println("Enter the id for search");
        Product p = product.getById(input.nextInt());
        System.out.println(p.getProdtuctName());

    }

    private void searchView() {
        System.out.println("Enter the strings for searching");

        for (Product p : product.search(input.next())) {
            System.out.println(p.getId() + "\t" + p.getProdtuctName() + "\t" + p.getCostPrice());
        }

    }

    private void fileWriter() {
        String path = "C:\\Users\\dumcc babu\\Desktop";
        System.out.println("Enter the file name");
        List<Product> file = product.getall();
        try {
            Writer writer = new FileWriter(path + input.next());
            writer.write(file.toString());
            writer.close();

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }

    public void process() {
        while (true) {

             menu();
        switch (input.nextInt()) {
            case 1:
                addView();
                break;
            case 2:
                removeView();
                break;
            case 3:
                getByIdView();
                break;
            case 4:

                showAllView();
                break;
            case 5:
                searchView();
                break;
            case 6:
                fileWriter();
                break;

            case 7:
                System.exit(0);
                break;

        }
    }

}
}
