package ru.Palyanaff.SamsungAcademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int s, m, h, n;
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        h = (n / 3600) % 24;

        m = (n / 60) % 60;

        s = n % 60;
        if (m / 10 == 0 && s / 10 == 0)
            System.out.println(h + ":0" + m + ":0" + s);
        else if (m / 10 == 0 && s / 10 != 0)
            System.out.println(h + ":0" + m + ":" + s);
        else if (m / 10 != 0 && s / 10 == 0)
            System.out.println(h + ":" + m + ":0" + s);
        else
            System.out.println(h + ":" + m + ":" + s);
    }
}


