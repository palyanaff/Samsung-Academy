package ru.Palyanaff;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toHexString(a));


        int iObj = Short.valueOf((short) a);

        if (iObj == a){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        iObj = Byte.valueOf((byte)a);

        if (iObj == a){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
