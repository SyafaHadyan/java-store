package com.filkom.javastore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Book javaBook = new Book("Penulis", 4096);
        javaBook.setName("javaBook: Learn Java for Beginners");
        javaBook.setDescription("Complete guide for beginners");
        javaBook.setPrice(128512);
        javaBook.readSynopsys();
        javaBook.displayInfo();
        System.out.println(javaBook.calculateDiscount() + "\n");
        System.out.println(javaBook.calculateDiscount(6.12) + "\n");

        Electronics laptop = new Electronics("Asus", 60);
        laptop.setName("Asus Laptop TUF");
        laptop.setDescription("Asus laptop TUF model with i7 CPU");
        laptop.setPrice(10000000);
        laptop.checkWarranty();
        laptop.displayInfo();
        System.out.println(laptop.calculateDiscount() + "\n");
        System.out.println(laptop.calculateDiscount(12.5) + "\n");

        Clothing indoorShirt = new Clothing("Large", "Improved Cotton");
        indoorShirt.setName("Red Indoor Shirt (default type)");
        indoorShirt.setDescription("Red shirt with default type");
        indoorShirt.setPrice(32767);
        indoorShirt.tryOn();
        indoorShirt.displayInfo();
        System.out.println(indoorShirt.calculateDiscount() + "\n");
        System.out.println(indoorShirt.calculateDiscount(50) + "\n");

        input.close();
    }
}
