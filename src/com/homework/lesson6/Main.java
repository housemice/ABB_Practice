package com.homework.lesson6;

public class Main {



    public static void main(String[] args) {
        GenericStorage<Person> genericStorage = new GenericStorage<>();
        Teacher mammedTeacher= new Teacher("Mammad",34);
        Student daniilStudent = new Student("Daniil",20);
        genericStorage.addItem(mammedTeacher);
        genericStorage.addItem(daniilStudent);
        genericStorage.displayAllItems();


    }
}
