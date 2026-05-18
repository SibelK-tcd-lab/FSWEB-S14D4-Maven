package org.example.model;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    // Tek constructor (Tüm değişkenleri set eden)
    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() { return type; }
    public double getPrice() { return price; }
    public String description() { return description; } // Testlerin beklentisine göre getter ismi
    public String getDescription() { return description; }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public abstract void showDetails();
}