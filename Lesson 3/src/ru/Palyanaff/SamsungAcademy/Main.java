package ru.Palyanaff.SamsungAcademy;

public class Main {

    public static void main(String[] args) {
        Calculator samp = new Calculator(0);
        System.out.println(samp.doSomething(3));
        System.out.println(samp.doSomething(-8));
        System.out.println(samp.getCurrent());
    }
}
