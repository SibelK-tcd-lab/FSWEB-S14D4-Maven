package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Sweets", 25.5, "Belgium Chocolate", 80);
        products[1] = new Coke("Beverage", 15.0, "Ice Cold", 10.5);
        products[2] = new Bread("Bakery", 8.0, "Freshly Baked", "Whole Wheat");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }
    }
}