package ru.Palyanaff.SamsungAcademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Hello World!"); // Output "Hello World!"*/
        Scanner in = new Scanner(System.in);

        int a, b, c;

        /*System.out.println("Enter first number: ");*/
        a = in.nextInt();

        /*System.out.println("Enter second number: ");*/
        b = in.nextInt();

        c = a + b;

        System.out.println("Sum = " + c);
    }
}
