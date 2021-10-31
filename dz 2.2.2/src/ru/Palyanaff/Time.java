package ru.Palyanaff;

public class Time {
    int hour, min, sec;

    public Time(int i)
    {

        hour = i / 3660 % 24;
        min = i / 60 % 60;
        sec = i % 60;

    }

    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
}
