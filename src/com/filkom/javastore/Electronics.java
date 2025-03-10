package com.filkom.javastore;

public class Electronics extends Product {
    private String brand;
    private int warrantyPeriod;

    public Electronics() {
        this.brand = "Default Brand";
        this.warrantyPeriod = 12;
    }

    public Electronics(String brand, int warrantyPeriod) {
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public void checkWarranty() {
        System.out.println("Warrany period: " + warrantyPeriod + " months");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
        System.out.println("Warrany period: " + warrantyPeriod + " months");
        System.out.println("====================");
    }
}
