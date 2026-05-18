package org.example.model;

public class Coke extends ProductForSale {
    private double sugarContent;

    // Testlerin beklediği 3 parametreli constructor
    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.sugarContent = 0.0;
    }

    // Görevde istenen 4 parametreli constructor
    public Coke(String type, double price, String description, double sugarContent) {
        super(type, price, description);
        this.sugarContent = sugarContent;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    @Override
    public void showDetails() {
        System.out.println("Product: Coke | Type: " + getType() + " | Price: " + getPrice() +
                " | Desc: " + getDescription() + " | Sugar: " + sugarContent + "g");
    }
}