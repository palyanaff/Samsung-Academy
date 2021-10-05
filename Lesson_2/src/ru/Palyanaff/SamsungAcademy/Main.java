package ru.Palyanaff.SamsungAcademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        int s = first + second + third;

        System.out.println(first + second + third);

        int i = 0;

        int[] arr = new int[10];

        int[][] arr1 = new int[5][6];

        for (int[] value : arr1){
            for (int val2 : value)
            {
                i++;
                if (i < 10) {
                    System.out.print("0" + i + " ");
                }
                else{
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        System.out.println("Function: " + number(s));
    }

    private static int number(int i){
        return i + 1;
    }
}
