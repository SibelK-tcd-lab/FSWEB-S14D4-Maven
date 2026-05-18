package org.example.model;

public class Chocolate extends ProductForSale {
    private int cocoaPercentage;

    // Testlerin beklediği 3 parametreli constructor
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.cocoaPercentage = 0;
    }

    // Görevde istenen 4 parametreli constructor
    public Chocolate(String type, double price, String description, int cocoaPercentage) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("Product: Chocolate | Type: " + getType() + " | Price: " + getPrice() +
                " | Desc: " + getDescription() + " | Cocoa: %" + cocoaPercentage);
    }
}