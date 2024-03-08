package com.homework.lesson4.task4;

public class PhoneNumber {
    private String phoneNumber;
    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws IllegalArgumentException {
        if (!phoneNumber.matches("^\\+994\\s(50|51|55)\\s\\d{3}-\\d{2}-\\d{2}$")) {
            throw new IllegalArgumentException("Invalid phone number format. Please adhere to the format: +994 50/51/55 xxx-xx-xx");
        }
        this.phoneNumber = phoneNumber;
    }
}
