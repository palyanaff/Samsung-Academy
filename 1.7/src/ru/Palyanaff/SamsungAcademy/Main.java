package ru.Palyanaff.SamsungAcademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        boolean simple = false;
        boolean div = false;

        while (!simple)
        {
            div = false;
            num++;
            for (int i = 2; i < num; i++)
            {
                if (num % i == 0){
                    div = true;
                    break;
                }
            }
            if (!div){
                simple = true;
            }
        }
        System.out.println(num);

        /*int num = in.nextInt();
        int i = 10;

        while (num > 0)
        {
            if (num % 10 < i && num % 10 > 0){
                i = num % 10;
            }
            num /= 10;
        }
        if (i == 10){
            System.out.println("NO");
        }
        else {
            System.out.println(i);
        }*/

        /*int a = in.nextInt();
        int sum = 0;

        while (a > 0)
        {
            sum++;
            a /= 10;
        }
        System.out.println(sum);*/

        /*int a = in.nextInt();

        int sum = 0;

        for (int i = 26; i < a; i += 2)
        {
            sum += i;
        }
        System.out.println(sum);*/

        /*int a = in.nextInt();
        int i = 0;

        while (a > 0)
        {
            i++;
            a /= 2;
        }

        System.out.println(i);*/

        /*int a = in.nextInt();
        int b = in.nextInt();

        int chast = 0;

        while (a >= b)
        {
            chast++;
            a -= b;
        }

        System.out.println(chast + " " + a);*/

        /*int a, sum =0;

        while (true)
        {
            a = in.nextInt();
            if (a < 10 || a >= 100){
                break;
            }
            else{
                sum += a % 10 + a / 10;
            }
        }

        System.out.println(sum);*/

        /*int a, sum = 0;

        do {
            a = in.nextInt();
            if (a > 10){
                sum += a;
            }
        } while (a % 5 != 0);

        System.out.println(sum);*/

        /*int i = 0;
        int a;

        do {
            i++;
            a = in.nextInt();
        } while (a >= 0);
        System.out.println(i);*/

    }
}
