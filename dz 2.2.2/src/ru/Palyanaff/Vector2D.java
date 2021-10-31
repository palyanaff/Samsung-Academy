package ru.Palyanaff;

import java.util.Locale;

public class Vector2D {

    private double vX;
    private double vY;
    static int count = 0;

    public Vector2D()
    {
        vX = 1.0;
        vY = 1.0;
        count++;
    }

    public Vector2D(double X, double Y)
    {
        vX = X;
        vY = Y;
        count++;
    }

    public Vector2D(Vector2D u) {
        this(u.getX(), u.getY());
    }

    public double getX() {
        return vX;
    }

    public double getY() {
        return vY;
    }

    public void add(Vector2D v)
    {
        vX += v.vX;
        vY += v.vY;
    }

    public void sub(Vector2D v)
    {
        vX -= v.vX;
        vY -= v.vY;
    }

    public double length()
    {
        double length = vX * vX + vY * vY;
        return Math.sqrt(length);
    }

    public void scale(double scaleFactor)
    {
        vX *= scaleFactor;
        vY *= scaleFactor;
    }

    public void normalized()
    {
        double length = Math.sqrt(vX * vX + vY * vY);
        vX /= length;
        vY /= length;
    }

    public double dotProduct(Vector2D v)
    {
        return vX * v.vX + vY * v.vY;
    }



    public void print()
    {
        System.out.print("(");
        System.out.print(String.format(Locale.US,"%.2f",vX));
        System.out.print(", ");
        System.out.print(String.format(Locale.US,"%.2f",vY));
        System.out.println(")");
    }

}
