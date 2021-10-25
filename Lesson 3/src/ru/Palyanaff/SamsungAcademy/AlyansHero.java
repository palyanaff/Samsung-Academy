package ru.Palyanaff.SamsungAcademy;

public class AlyansHero extends  Hero{
    public AlyansHero(String name, int hp){
        super(name);
    }
    public String speak(){
        return "За Альянс!";
    }

    @Override
    public void takeDamage(int damage) {

    }
}
