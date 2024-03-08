package com.classwork.lesson6;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1,"Na",2);
        Person person2 = new Person(1,"Na",2);

        String name1= new String("2");
        String name2 = new String("2");

        System.out.println(name1==name2);

        System.out.println(person1.hashCode()==person2.hashCode());
    }
}
