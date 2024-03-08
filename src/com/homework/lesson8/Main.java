package com.homework.lesson8;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Zaur","Namiq","Sadfgd",2003);
        Book book2 = new Book("Ragima","Gumru","Gadfsadfs",2004);
        Book book3 = new Book("sdjfb3","1243534809--","Genr21312435212e",2006);
        library.addBook(book1);
        library.addBook(book2);
//        library.addBook(book3);
//        System.out.println("library.getAllBooksSortedByAuthor : "+ library.getAllBooksSortedByAuthor());
//        System.out.println("------------------------------------------------------------------------");
//        System.out.println("library.getAllBooksSortedByTitle :" +library.getAllBooksSortedByTitle());
//        System.out.println("------------------------------------------------------------------------");
//        System.out.println("library.getAllBooksSortedByPublicationYear : " +library.getAllBooksSortedByPublicationYear());
//        System.out.println("------------------------------------------------------------------------");
//        System.out.println("library.getAveragePublicationYear : "+ library.getAveragePublicationYear());
//        System.out.println("------------------------------------------------------------------------");
        library.searchBook("Zaur");


        //library.removeBook();
        System.out.println("library.getAllBooksSortedByAuthor : "+ library.getAllBooksSortedByAuthor());
    }
}
