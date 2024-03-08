package com.homework.lesson5.task2;

public class Outer {

    private static class Inner {
        private static int count = 0;
        public Inner() {
            count++;
        }
        public static int getCount() {
            return count;
        }
    }
    public static void main(String[] args) {
        Inner inner1 = new Inner();
        Inner inner2 = new Inner();
        Inner inner3 = new Inner();
        System.out.println("Count of instances created: " + Inner.getCount()); // Output: 3
    }
}

