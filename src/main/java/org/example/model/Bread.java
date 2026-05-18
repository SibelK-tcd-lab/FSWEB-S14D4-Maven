package org.example.model;

public class Bread extends ProductForSale {
    private String flourType;

    // Testin hata verdiği 3 parametreli constructor
    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.flourType = "Default"; // Test 4. parametreyi vermediği için varsayılan bir değer atıyoruz
    }

    // Senin yazdığın 4 parametreli constructor
    public Bread(String type, double price, String description, String flourType) {
        super(type, price, description);
        this.flourType = flourType;
    }

    public String getFlourType() {
        return flourType;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + " Price: " + getPrice() + " Desc: " + getDescription() + " Flour: " + flourType);
    }
}
