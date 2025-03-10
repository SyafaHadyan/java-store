package com.filkom.javastore;

public class Book extends Product {
    private String author;
    private int pages;

    public Book() {
        this.author = "Default Author";
        this.pages = 2048;
    }

    public Book(String author, int pages) {
        this.author = author;
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void readSynopsys() {
        System.out.println("Reading synopsys ...\n");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("====================");
    }
}
