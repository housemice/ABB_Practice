package com.homework.lesson8;

public class Book {
    String title;
    String authorName;
    String genre;
    Integer publishYear =0;


    public Book(String title, String authorName, String genre, Integer publishYear) {
        this.title = title;
        this.authorName = authorName;
        this.genre = genre;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }



    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + authorName + ", Genre: " + genre + ", Publication Year: " + publishYear;
    }
}
