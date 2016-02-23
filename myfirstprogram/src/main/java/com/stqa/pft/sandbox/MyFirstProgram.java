package com.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {

        hello("world!!!!");
        hello("user");

        double l = 7;
        System.out.println("area 7 = " + area(l));
        double a = 5;
        double b = 4;
        System.out.println("area 5 4 = " + area(a, b));
    }

    public static void hello(String somebody) {
        //String somebody = "world";

        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double len) {
        return len * len;
    }

    public static double area(double a, double b) {
        return a * b;
    }
}