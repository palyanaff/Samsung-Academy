package ru.Palyanaff.SamsungAcademy;

public abstract class Hero implements DamageTaker {
    private static int baseDamage = 50;
    private String name;
    private int hp;


    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract String speak();

    public Hero () {}

    public static void setBaseDamage (int baseDamage){
        Hero.baseDamage = baseDamage < 1 ? 1 : baseDamage;
    }

    public boolean isDead(){
        return hp <= 0;
    }

    public void takeDamage(int damage){
        hp -= damage;
    }

    public void takeBaseDamage() {
        hp -= baseDamage;
    }

}
