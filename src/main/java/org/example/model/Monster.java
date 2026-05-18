package org.example.rpg;

public abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() { return name; }
    public int getHitPoints() { return hitPoints; }
    public double getDamage() { return damage; }

    public double attack() {
        double finalDamage = getDamage();

        if (this instanceof Bleedable) {
            finalDamage += ((Bleedable) this).bleed();
        }

        if (this instanceof Poisonable) {
            finalDamage += ((Poisonable) this).poison();
        }

        return finalDamage;
    }
}