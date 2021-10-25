package ru.Palyanaff.SamsungAcademy;

public class OrdaHero extends  Hero{
    public OrdaHero(String name, int hp){
        super(name);
    }
    public String speak(){
        return "За Орду! из доч класса";
    }

    @Override
    public void takeDamage(int damage) {

    }
}
