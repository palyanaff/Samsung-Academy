package ru.Palyanaff.SamsungAcademy;

public class Calculator {
    private int current;

    public Calculator(){
    }
    public Calculator(int StartValue){
        current = StartValue;
    }

    public int doSomething(int arg){
        current += arg;
        return current;
    }
    public int getCurrent(){
        return current;
    }
}
