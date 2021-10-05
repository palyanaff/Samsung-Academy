package ru.Palyanaff.SamsungAcademy;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.sin;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double y = in.nextDouble();

        if (y >= 0. && y <= 0.5 && y <= -sin(x * PI))
            System.out.println("YES");
        else
            System.out.println("NO");
        /*if (y > 0 && x > 0)
        {
            if (y <= 1 && x <= 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else {
            if (x * x + y * y <= 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }*/

        /*if (y > 0)
        {
            if (y >= x - 1 && y <= 1 && x >= 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else{
            if (x * x + y * y <= 1 && x >= 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }*/

        /*if (x > 0)
        {
            if (x <= 1 && y >= 1 - x)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else{
            if (y >= 1 - x && y >= 2 * x * x)
                System.out.println("YES");
            else
                System.out.println("NO");
        }*/

        /*if (x <= 1 && y >= 1 - x && y >= 2 * x * x)
            System.out.println("YES");
        else
            System.out.println("NO");
    */

        /*if (x * x + y * y <= 1 && (y >= -x || y <= x))
            System.out.println("YES");
        else
            System.out.println("NO");*/

        /*if (x > 0)
        {
            if (x * x + y * y <= 1 && y >= x)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else{
            if (x * x + y * y <= 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }*/
        //System.out.println(-sin(x * PI));
    }
}
