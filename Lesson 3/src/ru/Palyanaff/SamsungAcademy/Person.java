package ru.Palyanaff.SamsungAcademy;

public class Person {
    private static int lastId;
    private String Name;
    private double hp;
    private double xp;
    private final int id;

    public Person(String name) {
        this.id = lastId++;
        if (name == null){
            name = "NoName #" + id;
        }
        this.Name = name;

    }

    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }

    public double getXp() {
        return xp;
    }

    public void addXp(double xp) {
        if (xp < 0){
            xp = 0;
        }
        this.xp += xp;
    }

    public int getId(){
        return id;
    }

    public int getLevel(){
        return (int) (xp / 50);
    }
}
