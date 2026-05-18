package org.example.model;

public class Coke extends ProductForSale {
    private double sugarContent;

    // TESTİN BEKLEDİĞİ: 3 Parametreli Constructor
    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.sugarContent = 0.0; // Varsayılan değer
    }

    // SENİN YAZDIĞIN: 4 Parametreli Constructor
    public Coke(String type, double price, String description, double sugarContent) {
        super(type, price, description);
        this.sugarContent = sugarContent;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + " Price: " + getPrice() +
                " Desc: " + getDescription() + " Sugar: " + sugarContent);
    }
}
