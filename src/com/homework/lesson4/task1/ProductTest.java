package com.homework.lesson4.task1;

import java.util.Scanner;

public class ProductTest{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String name= scanner.next();
        Product product= new Product(String.valueOf(name));
        System.out.println(product.productName+" "+product.productID+" "+ product.companyName);
    }

}
