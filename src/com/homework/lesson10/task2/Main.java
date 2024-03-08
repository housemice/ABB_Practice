package com.homework.lesson10.task2;

import java.util.Scanner;

public class Main {
    public static void validateInput(int input) throws InvalidInputException {
        int minRange = 1;
        int maxRange = 100;

        if (input < minRange || input > maxRange) {
            throw new InvalidInputException("Input must be between " + minRange + " and " + maxRange);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number between 1 and 100 : ");
            int userInput = scanner.nextInt();

            validateInput(userInput);

            System.out.println("Valid input : " + userInput);
        } catch (InvalidInputException e) {
            System.out.println("Invalid input : " + e.getMessage());
        }
    }
}
