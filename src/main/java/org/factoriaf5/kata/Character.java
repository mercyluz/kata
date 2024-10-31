package org.factoriaf5.kata;

public class Character {
    private Long id;
    private String name;
    private int health;
    private int level;
    private boolean isAlive;
    private int damage;
    private int maxRange; // Máxima distancia de ataque

    // Constructor
    public Character(Long id, String name, int damage, int maxRange) {
        this.id = id;
        this.name = name;
        this.health = 1000;
        this.level = 1;
        this.isAlive = true;
        this.damage = damage;
        this.maxRange = maxRange;
    }

    public void dealDamage(Character target, int distance) {
        if (this == target) {
            throw new IllegalArgumentException("A Character cannot deal damage to itself.");
        }
        if (!this.isAlive) {
            throw new IllegalStateException("Dead characters cannot deal damage.");
        }
        if (!target.isAlive) {
            throw new IllegalStateException("Cannot deal damage to a dead character.");
        }
        if (distance > this.maxRange) {
            throw new IllegalArgumentException("Target is out of range.");
        }

        int damageToDeal = this.damage;

        // Ajuste del daño según el nivel
        if (target.getLevel() >= this.level + 5) {
            damageToDeal *= 0.5; // Reducir daño en 50%
        } else if (target.getLevel() <= this.level - 5) {
            damageToDeal *= 1.5; // Aumentar daño en 50%
        }

        target.receiveDamage(damageToDeal);
    }

    public void heal(Character target) {
        if (this != target) {
            throw new IllegalArgumentException("A Character can only heal itself.");
        }
        if (!this.isAlive) {
            throw new IllegalStateException("Dead characters cannot be healed.");
        }

        this.health += 10;
        if (this.health > 1000) {
            this.health = 1000; // No puede exceder 1000
        }
    }

    private void receiveDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.health = 0;
            this.isAlive = false;
        }
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public boolean isAlive() {
        return isAlive;
    }
}