package ru.Palyanaff.SamsungAcademy;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for(; n > 0; n--)
        {
            System.out.println(n);
        }


        /*int n = in.nextInt();

        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = n - i - 1; j < n; j++)
            {
                    a[i][j] = 2;
                    a[i][n - i - 1] = 1;
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }*/

        /*int n = in.nextInt();
        int k = 0;

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
        {
            int a = in.nextInt();
            arr[i] = a;
        }

        int num = in.nextInt();

        for (int i = 0; i < n; i++)
        {
            if (arr[i] == num){
                k++;
            }
        }

        System.out.println(k);*/

        /*int a[][] = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = n - i + 1; j < n;j++){
                a[i][j]= 2;
                a[i][j - 1]= 1;
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }*/

    }

}

