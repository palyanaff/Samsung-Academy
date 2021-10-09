package ru.Palyanaff.SamsungAcademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (Math.max(a,b) == a){
            int buff = a;
            a = b;
            b = buff;
        }
        if (Math.max(a,c) == a){
            int buff = a;
            a = c;
            c = buff;
        }
        if (Math.max(b,c) == b){
            int buff = b;
            b = c;
            c = buff;
        }

        //System.out.println(a + " " + b + " " + c);

        if (a * a + b * b == c * c){
            System.out.println("right");
        }
        else if (c > a + b){
            System.out.println("impossible");
        }
        else if (c * c < a * a + b * b){
            System.out.println("acute");
        }
        else{
            System.out.println("obtuse");
        }

        /*int n = in.nextInt();

        if (n == 100){
            System.out.println("C");
        }
        else if (n == 50){
            System.out.println("L");
        }
        else if (n == 10){
            System.out.println("X");
        }
        else if (n == 5){
            System.out.println("V");
        }
        else if (n == 1){
            System.out.println("I");
        }
        else{
            System.out.println(0);
        }

        int s = n;
        int ost;

        while (n > 0)
        {
            for (int i = 0; i < n/100; i++)
            {
                System.out.print("C");
                s = n / 100;
                ost = n % 100;
            }
            for (int i = 0; i < n/50; i++)
            {
                System.out.println("L");
                n /= 50;
            }
        }
        System.out.println(n);*/ //roman numbers

        /*int month = in.nextInt();
        int day = in.nextInt();

        int s = check(month, day);

        System.out.println(check(month, day));

        if (check(month, day) != -1)
        {
            for (int i = month + 1; i < 13; i++)
            {
                if (i == 2){
                    s += 28;
                }
                else if (i < 8){
                    if (i % 2 == 1) {
                        s += 31;
                    }
                    else {
                        s += 30;
                    }
                }
                else {
                    if (i % 2 == 0){
                        s += 31;
                    }
                    else{
                        s += 30;
                    }
                }
                System.out.println(check(i, day));
            }
        }
        System.out.println(s);*/

        /*int month = in.nextInt();

        if (month == 2){
            System.out.println(28);
        }
        else if (month <= 0 || month > 12){
            System.out.println(0);
        }
        else if (month < 8){
            if (month % 2 == 1) {
                System.out.println(31);
            }
            else {
                System.out.println(30);
            }
        }
        else {
            if (month % 2 == 0){
                System.out.println(31);
            }
            else{
                System.out.println(30);
            }
        }*/

    }
    /*public static int check(int month, int day)
    {
        if (month == 2){
            if (day > 28 || day < 1){
                return -1;
            }
            else{
                return 28 - day;
            }
        }
        else if (month <= 0 || month > 12){
            return -1;
        }
        else if (month < 8){
            if (month % 2 == 1) {
                if (day > 31 || day < 1){
                    return -1;
                }
                else {
                    return 31 - day;
                }
            }
            else {
                if (day > 30 || day < 1){
                    return -1;
                }
                else {
                    return 30 - day;
                }
            }
        }
        else {
            if (month % 2 == 0){
                if (day > 31 || day < 1){
                    return -1;
                }
                else {
                    return 31 - day;
                }
            }
            else{
                if (day > 30 || day < 1){
                    return -1;
                }
                else {
                    return 30 - day;
                }
            }
        }
    }*/
}
