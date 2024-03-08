package com.homework.lesson8;

import com.homework.lesson8.Book;

import java.util.*;
import java.util.stream.Collectors;

public class Library {

    ArrayList<Book> books = new ArrayList<>();
    HashSet<Integer> avgYear = new HashSet<>();

    public Library() {
    }

    public void addBook(Book book){
        avgYear.add(book.getPublishYear());
        books.add(book);
    }
    public void removeBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put title of book : ");
        String title= scanner.nextLine();
        System.out.println("Put author of author : ");
        String author= scanner.nextLine();
        System.out.println("Put genre of book : ");
        String genre= scanner.nextLine();
        System.out.println("Put year of book : ");
        int year= scanner.nextInt();
        Book book = new Book(title,author,genre,year);
        try {
            books.remove(book);
        }
        catch (Exception NoSuchElementException ){
            System.out.println("No such book ,try again ,check all parameters");
        }
        System.out.println("Book is deleted");

    }
    public void searchBook(String name){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Write name of book,author,genre");
        String query = scanner.nextLine().toLowerCase().trim();

        System.out.println("result ;");
        for (Book book : books) {
            System.out.println("asomsa");
            if (book.getTitle().toLowerCase().contains(query) ||
                    book.getAuthorName().toLowerCase().contains(query) ||
                    book.getGenre().toLowerCase().contains(query)) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthorName());
                System.out.println("Genre: " + book.getGenre());
                System.out.println();
            }
    }}
    public List<Book> searchByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    public List<Book> searchByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthorName().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public List<Book> searchByGenre(String genre) {
        return books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    public List<Book> getAllBooksSortedByTitle() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    public List<Book> getAllBooksSortedByAuthor() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getAuthorName))
                .collect(Collectors.toList());
    }

    public List<Book> getAllBooksSortedByPublicationYear() {
        return books.stream()
                .sorted(Comparator.comparingInt(Book::getPublishYear))
                .collect(Collectors.toList());
    }

    public double getAveragePublicationYear() {
        OptionalDouble average = books.stream()
                .mapToInt(Book::getPublishYear)
                .average();
        return average.orElse(0);
    }

    public int countBooks() {
        return books.size();
    }

}



