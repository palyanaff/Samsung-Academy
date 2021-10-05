package ru.Palyanaff.SamsungAcademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A;
        boolean f = true;

        A = in.nextInt();

        if (A == 1){
            f = true;
        }
        else{
            while(A != 0)
            {
                if (A == 1){
                    //f = false;
                    break;
                }
                else if (A % 2 != 0){
                    f = false;
                    break;
                }
                A = A / 2;
            }
        }

        if (f){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        //A = A & (1 << i) - 1;
        //A = A ^ (1 << 1) << i - 1;
        //A = A | (1 << 1) << i - 1;
        //int i1 = i != 0 ? A & -(1 << i) : A;

        //System.out.println(A);
    }
}
