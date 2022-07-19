package com.company;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();
    private int damage;
    private int health;

    public Boss(int damage, int health) {
        super(damage, health);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public String info(){
        return getHealth() + getDamage() + weapon.getDragunovsniperRifle() + weapon.getGunshot();
    }
}

