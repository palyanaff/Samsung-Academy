package ru.Palyanaff.SamsungAcademy;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Hero h1 = new AlyansHero("Первый!");
        Hero h2 = new OrdaHero("Первый!");
        Hero h3 = new NezitHero("Первый!");
        Hero h4 = new Hero("Second");
        System.out.println(h1.speak());
        System.out.println(h2.speak());
        System.out.println(h3.speak());
        System.out.println(h4.speak());

        /*Person[] people = {
                new Person(null),
                new Person("Maxim"),
                new Person(null)
        };

        Random random = new Random(100500);

        for (Person person : people){
            System.out.println(random.nextDouble() * 500);
            person.addXp(random.nextDouble() * 500);
        }
        for (Person person : people)
        {
            System.out.println(person.getId() + " " + person.getName() + " " + person.getLevel());
        }*/

        /*Person p = new Person("Tolchef");

        System.out.println(p.getName());
        p.setName("LolKek");
        System.out.println(p.getName());

        p.addXp(-560);
        System.out.println(p.getLevel());*/

        /*Calculator samp = new Calculator(0);
        System.out.println(samp.doSomething(3));
        System.out.println(samp.doSomething(-8));
        System.out.println(samp.getCurrent());
        */

    }
}

