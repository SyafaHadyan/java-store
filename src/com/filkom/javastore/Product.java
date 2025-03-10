package com.filkom.javastore;

public class Product {
    protected String name;
    protected String description;
    protected long price;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String Description() {
        return this.description;
    }

    public long setPrice() {
        return this.price;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: Rp" + price);
    }

    public double calculateDiscount() {
        double result = 0.9 * price;
        System.out.println("Discount: 10% (Tanpa parameter)");
        System.out.println("Discount: Rp" + (0.1 * price));
        System.out.print("Discounted price: Rp");
        return result;
    }

    public double calculateDiscount(double percentage) {
        double result = ((100 - percentage) / 100d) * price;
        System.out.println("Discount: " + percentage + "% (Dengan parameter)");
        System.out.println("Discount: Rp" + ((percentage / 100d) * price));
        System.out.print("Discounted price: Rp");
        return result;
    }
}
