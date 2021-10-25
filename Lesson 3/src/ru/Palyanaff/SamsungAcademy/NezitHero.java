package ru.Palyanaff.SamsungAcademy;

public class NezitHero extends  Hero{
    public NezitHero(String name, int hp){
        super(name);
    }
    public String speak(){
        return "Смерть за Нерзула! из доч класса";
    }

    @Override
    public void takeDamage(int damage) {

    }
}
