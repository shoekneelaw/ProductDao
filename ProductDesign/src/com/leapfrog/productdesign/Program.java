/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.productdesign;

import com.leapfrog.productdesign.controller.ProductController;
import com.leapfrog.productdesign.impl.ProductDaoImpl;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        ProductController pc = new ProductController(input, new ProductDaoImpl());
       while (true ){
           pc.process();
       }         
           
        

    }
}


