package ru.Palyanaff.SamsungAcademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, sum = 0;

        do {
            a = in.nextInt();
            if (a > 10){
                sum += a;
            }
        } while (a % 5 != 0);

        System.out.println(sum);

        /*int i = 0;
        int a;

        do {
            i++;
            a = in.nextInt();
        } while (a >= 0);
        System.out.println(i);*/

    }
}
