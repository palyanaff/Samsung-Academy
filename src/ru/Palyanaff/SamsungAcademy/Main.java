package ru.Palyanaff.SamsungAcademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i = 5;
        int b = 2;
        double s;
        s = i + b;
        Scanner in = new Scanner(System.in);
        double f = in.nextDouble();
        System.out.println("Sum without your number: " + s);
        System.out.print("Sum with your number: ");
        s = s + f;
        System.out.println(s);
        s++;
        System.out.println(s);
    }
}
