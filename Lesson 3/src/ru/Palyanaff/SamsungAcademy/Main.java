package ru.Palyanaff.SamsungAcademy;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Hero h1 = new AlyansHero("Первый!", 100);
        Hero h2 = new OrdaHero("Первый!", 100);
        Hero h3 = new NezitHero("Первый!", 100);
        /*Hero h4 = new Hero("Second");*/
        System.out.println(h1.speak());
        System.out.println(h2.speak());
        System.out.println(h3.speak());
        /*System.out.println(h4.speak());*/



    }
}

