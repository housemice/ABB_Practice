package com.homework.lesson4.task1;

import java.util.Scanner;

public class Product {
    static String companyName;
    String productName;
    int productID=1000;
    static {
        companyName="CompanyName";
    }
    public Product(){
       productID++;
    }
    public Product(String productName){
        this.productName=productName;
    }
}

