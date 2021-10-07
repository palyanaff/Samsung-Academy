package ru.Palyanaff.SamsungAcademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int n = f.nextInt();

        int[] arr = new int[1000000];


        int j = 0;

        for (int i = 1; i <= n; i++)
        {
            if (i < 5) {
                arr[i] = arr[i - 1] + 1;
            }

            else if (i < 9){
                arr[i] = min(arr[i - 1], arr[i - 5]) + 1;
            }

            else if (i < 10){

                arr [i] = min(min(arr[i - 1], arr[i - 5]), arr[i - 9]) + 1;
            }

            else{
                arr[i] = min( min( min (arr[i - 1], arr[i - 5]), arr[i - 9]), arr[i - 10]) + 1;
            }
        }
        System.out.println(arr[n]);

        for (int i = n; i > 0;)
        {
            if (i < 5)
            {
                System.out.print(1 + " ");
                i--;
            }
            else if (i < 9){
                if (arr[i - 1] == min(arr[i - 1], arr[i - 5])){
                    System.out.print(1 + " ");
                    i--;
                }
                else{
                    System.out.print(5 + " ");
                    i -= 5;
                }
            }
            else if (i < 10){
                if (arr[i - 1] == min( min(arr[i - 1], arr[i - 5]), arr[i - 9])){
                    System.out.print(1 + " ");
                    i--;
                }
                else if (arr[i - 5] == min( min(arr[i - 1], arr[i - 5]), arr[i - 9])){
                    System.out.print(5 + " ");
                    i -= 5;
                }
                else{
                    System.out.print(9 + " ");
                    i -= 9;
                }
            }
            else{
                if (arr[i - 1] == min(min( min(arr[i - 1], arr[i - 5]), arr[i - 9]), arr[i - 10])){
                    System.out.print(1 + " ");
                    i--;
                }
                else if (arr[i - 5] == min(min( min(arr[i - 1], arr[i - 5]), arr[i - 9]), arr[i - 10])){
                    System.out.print(5 + " ");
                    i -= 5;
                }
                else if (arr[i - 9] == min(min( min(arr[i - 1], arr[i - 5]), arr[i - 9]), arr[i - 10])){
                    System.out.print(9 + " ");
                    i -= 9;
                }
                else{
                    System.out.print(10 + " ");
                    i -= 10;
                }

            }


        }

    }
    public static int min(int a, int b){
        return Math.min(a, b);
    }

}
