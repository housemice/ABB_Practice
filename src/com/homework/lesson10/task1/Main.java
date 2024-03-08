package com.homework.lesson10.task1;

/*
Task:
Create a program that reads an integer from the user and prints its square.
However, if the user enters a non-integer input, handle an exception and prompt the user to enter a valid integer.
(This process should continue until the user enters an integer)
 */

import com.classwork.lesson10.TestCustomExcp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        square();
    }
    public static void square() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                int num = Integer.parseInt(scanner.nextLine());
                int square = num * num;
                System.out.println("The square of " + num + " is " + square);
                break;
            } catch(NumberFormatException e) {
                System.out.println("You inputed not integer, try again : ");
            }
        }
        scanner.close();
    }

}

