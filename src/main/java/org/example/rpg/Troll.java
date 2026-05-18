package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable {

    // Üst sınıfın (Monster) constructor'ına değerleri gönderen yapı
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    // Bleedable interface'inden gelen metot: Hasarın %25'ini ekler
    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    // Poisonable interface'inden gelen metot: Hasarın %30'unu ekler
    @Override
    public double poison() {
        return getDamage() * 0.3;
    }
}