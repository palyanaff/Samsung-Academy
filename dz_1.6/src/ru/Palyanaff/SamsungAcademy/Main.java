package ru.Palyanaff.SamsungAcademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int [] arr = new int[10001];

        if (n > 0){
            for (int i = 0; i < n; i++)
            {
                arr[i] = in.nextInt();
            }

            int right = 1, left = n - 1;
            while (right != left)
            {
                for (int i = right; i < left; i++)
                {
                    if (arr[i - 1] == 0){
                        arr[i - 1] = arr[i];
                        arr[i] = 0;
                    }
                }


                for (int i = left; i > right; i--)
                {
                    if (arr[i - 1] == 0){
                        arr[i - 1] = arr[i];
                        arr[i] = 0;

                    }
                }
                left--;
                right++;
            }

            for (int i = 0; i < n; i++)
            {
                System.out.print(arr[i] + " ");
            }
        }


        /*int n = in.nextInt();

        int [] arr = new int[10001];

        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }

        int right = 1, left = n - 1;
        while (right != left)
        {
            for (int i = right; i < left; i++)
            {
                if (arr[i - 1] > arr[i]){
                    int buff = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = buff;
                }
            }
            left--;

            for (int i = left; i > right; i--)
            {
                if (arr[i] < arr[i - 1]){
                    int buff = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = buff;
                }
            }
            right++;
        }

        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }*/

        /*float a = in.nextFloat();
        float b = in.nextFloat();

        if (a == 0 && b <= 0){
            System.out.println("no such x");
        }
        else if(a == 0){
            System.out.println("any x");
        }
        else if (a < 0 && b < 0){
            System.out.println("no such x");
        }
        else if ((-b / a) < 0){
            System.out.println("any x");
        }
        else if (a > 0){
            float s = (float) (Math.round((b / a) * 10.0) / 10.0);
            float s1 = (float) (Math.round((-b / a) * 10.0) / 10.0);

            if ((-b / a) > (b / a)){
                System.out.println("x<" + s + " or " + "x>" + s1);
            }
            else{
                System.out.println(s1 + "<x<" + s);
            }
        }
        else{
            float s = (float) (Math.round((b / a) * 10.0) / 10.0);
            float s1 = (float) (Math.round((-b / a) * 10.0) / 10.0);
            if ((-b / a) > (b / a)){
                System.out.println(s + "<x<" + s1);
            }
            else{
                System.out.println("x<" + s1 + " or " + "x>" + s);
            }
        }*/

        /*int n = in.nextInt();

        if (n % 10 == 0){
            System.out.println(n + " TOPTOB");
        }
        else if ( n != 11 && n % 100 == 1){
            System.out.println(n + " TOPT");
        }
        else if (n < 5){
            System.out.println(n + " TOPTA");
        }
        else if (n % 100 > 10 && n % 100 < 20){
            System.out.println(n + " TOPTOB");
        }
        else if (n != 11 && n % 10 == 1) {
            System.out.println(n + " TOPT");
        }
        else if (n > 21 && n % 10 < 5){
            System.out.println(n + " TOPTA");
        }
        else {
            System.out.println(n + " TOPTOB");
        }*/

        /*int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if (num2 < num1){
            int buff = num1;
            num1 = num2;
            num2 = buff;
        }
        if (num3 < num1){
            int buff = num1;
            num1 = num3;
            num3 = buff;
        }
        if (num3 < num2){
            int buff = num2;
            num2 = num3;
            num3 = buff;
        }

        System.out.print(num1 + " " + num2 + " " + num3);*/

        /*int n = in.nextInt();

        if (n < 10 && n >= 0){
            System.out.println("DIGIT");
        }
        else if (n > 0 && n < 100){
            System.out.println("NUM");
        }
        else{
            System.out.println("OTHER");
        }*/

    }



}
