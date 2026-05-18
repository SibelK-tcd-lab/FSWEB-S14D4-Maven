package org.example.model;

public class Chocolate extends ProductForSale {
    private int cocoaPercentage;

    // TESTİN BEKLEDİĞİ: 3 Parametreli Constructor
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.cocoaPercentage = 0; // Varsayılan bir değer atıyoruz
    }

    // SENİN YAZDIĞIN: 4 Parametreli Constructor
    public Chocolate(String type, double price, String description, int cocoaPercentage) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + " Price: " + getPrice() +
                " Desc: " + getDescription() + " Cocoa: %" + cocoaPercentage);
    }
}