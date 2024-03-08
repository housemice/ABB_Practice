package com.homework.lesson4.task4;

import java.util.Scanner;

public class PhoneNumberFormatChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a phone number: ");
        String phoneNumberInput = scanner.nextLine();
        try {
            PhoneNumber phoneNumber = new PhoneNumber(phoneNumberInput);
            System.out.println( phoneNumber.getPhoneNumber());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("is invalid");
        }
    }
}
