package ru.Palyanaff.SamsungAcademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);

        int a, b, c, n = 0;
        a = f.nextInt();
        b = f.nextInt();
        c = f.nextInt();

        if (a % 2 == 0)
            n += 1;
        if (b % 2 == 0)
            n += 1;
        if (c % 2 == 0)
            n += 1;

        if (n >= 2)
            System.out.println("true");
        else
            System.out.println("false");


    }
}
