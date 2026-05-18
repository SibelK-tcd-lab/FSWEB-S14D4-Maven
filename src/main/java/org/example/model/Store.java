package org.example;

// --- ÜRÜN MODELLEMESİ ---

abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() { return type; }
    public double getPrice() { return price; }
    public String getDescription() { return description; }
    public double getSalesPrice(int quantity) { return quantity * price; }

    public abstract void showDetails();
}

class Chocolate extends ProductForSale {
    private int cocoaPercentage;
    public Chocolate(String t, double p, String d, int cocoa) {
        super(t, p, d);
        this.cocoaPercentage = cocoa;
    }
    @Override
    public void showDetails() {
        System.out.println("Chocolate -> Type: " + getType() + ", Price: " + getPrice() + ", Cocoa: %" + cocoaPercentage);
    }
}

class Coke extends ProductForSale {
    private boolean isDiet;
    public Coke(String t, double p, String d, boolean isDiet) {
        super(t, p, d);
        this.isDiet = isDiet;
    }
    @Override
    public void showDetails() {
        System.out.println("Coke -> Type: " + getType() + ", Price: " + getPrice() + ", Diet: " + isDiet);
    }
}

class Bread extends ProductForSale {
    private String flourType;
    public Bread(String t, double p, String d, String flour) {
        super(t, p, d);
        this.flourType = flour;
    }
    @Override
    public void showDetails() {
        System.out.println("Bread -> Type: " + getType() + ", Price: " + getPrice() + ", Flour: " + flourType);
    }
}

// --- RPG MODELLEMESİ ---

interface Bleedable { double bleed(); }
interface Poisonable { double poison(); }

abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() { return name; }
    public double getDamage() { return damage; }

    public double attack() {
        double total = damage;
        if (this instanceof Bleedable) total += ((Bleedable) this).bleed();
        if (this instanceof Poisonable) total += ((Poisonable) this).poison();
        return total;
    }
}

class Troll extends Monster implements Bleedable, Poisonable {
    public Troll(String n, int hp, double d) { super(n, hp, d); }
    @Override public double bleed() { return getDamage() * 0.25; }
    @Override public double poison() { return getDamage() * 0.3; }
}

// --- ANA ÇALIŞTIRICI (MAIN) ---

public class Store {
    public static void main(String[] args) {
        // Ürünler Test
        System.out.println("--- Store Products ---");
        ProductForSale[] products = {
                new Chocolate("Sweets", 25, "Belgium", 80),
                new Coke("Drink", 15, "Cold", true),
                new Bread("Bakery", 8, "Fresh", "Wheat")
        };
        listProducts(products);

        // RPG Test
        System.out.println("\n--- RPG Game ---");
        Monster troll = new Troll("Mountain Troll", 1000, 50);
        System.out.println(troll.getName() + " attacks with: " + troll.attack() + " damage!");
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale p : products) {
            if (p != null) p.showDetails();
        }
    }
}