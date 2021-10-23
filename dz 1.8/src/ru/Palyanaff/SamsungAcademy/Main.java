package ru.Palyanaff.SamsungAcademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = 0;

        for (int i = 0; i < n; i++)
        {
            int a = in.nextInt();
            if (a != 0){
                System.out.print(a + " ");
                k++;
            }
        }

        for (int i = k; i < n; i++)
        {
            System.out.print(0 + " ");
        }

        /*int n = in.nextInt();
        int arr[] = new int[n];
        int brr[] = new int[n];
        int k = 0;
        int j1 = 0;
        int j2 = 0;

        for (int i = 0; i < n; i++)
        {
            int a = in.nextInt();
            if (a < 0){
                brr[j1] = a;
                j1++;
            } else {
                arr[j2] = a;
                j2++;
            }
        }

        for (int i = 0; i < n; i++)
        {
            if (brr[i] < 0){
                System.out.print(brr[i] + " ");
                k++;
            } else {
                break;
            }
        }
        for (int i = 0; i < n - k; i++)
        {
            if (arr[i] >= 0){
                System.out.print(arr[i] + " ");
            } else {
                break;
            }
        }*/

        /*int n = in.nextInt();
        int arr[] = new int[n];
        int brr[] = new int[n];

        for (int i = 0; i < n; i++)
        {
            int a = in.nextInt();
            arr[i] = a;
            brr[i] = a;
        }

        int maxcount = 0, nn = 0;
        for (int i = 0; i < n; i++)
        {
            int count = 0;
            for (int j = i; j < n; j++)
                if (arr[i] == arr[j]){
                    count++;
                }


            if (maxcount < count)
            {
                maxcount = count;
                nn = arr[i];
            }
        }

        System.out.println(nn);*/

        /*int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }

        for (int i = n - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }*/

        /*int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = 4 + 3 * i;
        }

        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }*/

        /*int n = in.nextInt();
        int k = 0;
        float sum = 0;
        boolean number = false;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (num % 2 != 0) {
                sum += num;
                k++;
                number = true;
            }
        }
        if (!number) {
            System.out.println("NO");
        } else {
            System.out.printf("%.2f", sum / k);
        }*/

        /*int n = in.nextInt();
        int sum = 0;
        boolean number = false;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (num % 2 == 0) {
                sum += num;
                number = true;
            }
        }
        if (!number) {
            System.out.println("NO");
        } else {
            System.out.println(sum);
        }*/

        /*int n = in.nextInt();
        int arr[] = new int[n];
        boolean number = false;

        for (int i = 0; i < n; i++)
        {
            int num = in.nextInt();
            arr[i] = num;
        }

        int val = in.nextInt();

        for (int i = 0; i < n; i++)
        {
            if (arr[i] == val){
                System.out.println(i + 1);
                number = true;
                break;
            }
        }
        if(!number){
            System.out.println("NO");
        }
    }*/
    }
}
