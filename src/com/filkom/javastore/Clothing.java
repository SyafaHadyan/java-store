package com.filkom.javastore;

public class Clothing extends Product {
    private String size;
    private String material;

    public Clothing() {
        this.size = "Normal";
        this.material = "Cotton";
    }

    public Clothing(String size, String material) {
        this.size = size;
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void tryOn() {
        System.out.println("Trying current clothing ...\n");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("====================");
    }
}
