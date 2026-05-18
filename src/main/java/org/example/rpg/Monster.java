package org.example.rpg;

public abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;

    // Canavarın adını, canını ve vuruş gücünü set eden constructor
    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    // Testlerin beklediği Getter metotları
    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    // attack metodu: Taban hasarın üzerine ekstra yetenek hasarlarını ekler
    public double attack() {
        double totalDamage = getDamage();

        // Eğer canavar Bleedable (Kanatabilir) ise kanama hasarını ekle
        if (this instanceof Bleedable) {
            totalDamage += ((Bleedable) this).bleed();
        }

        // Eğer canavar Poisonable (Zehirleyebilir) ise zehir hasarını ekle
        if (this instanceof Poisonable) {
            totalDamage += ((Poisonable) this).poison();
        }

        return totalDamage;
    }
}
