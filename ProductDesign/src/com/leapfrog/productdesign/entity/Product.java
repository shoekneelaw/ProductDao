/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.productdesign.entity;

/**
 *
 * @author user
 */
public class Product {
    private int id,quantity;
    private String prodtuctName;
    private double costPrice,sellPrice;
    private boolean status;

    public Product() {
    }

    public Product(int id, int quantity, String prodtuctName, double costPrice, double sellPrice, boolean status) {
        this.id = id;
        this.quantity = quantity;
        this.prodtuctName = prodtuctName;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProdtuctName() {
        return prodtuctName;
    }

    public void setProdtuctName(String prodtuctName) {
        this.prodtuctName = prodtuctName;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
       
}
