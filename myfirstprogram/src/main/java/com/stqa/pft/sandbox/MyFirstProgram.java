package com.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {

        hello("world!!!!");
        hello("user");

        Square s = new Square(7);

        System.out.println("area 7 = " + area(s));

        Rectangle r = new Rectangle(5, 4);

        System.out.println("area 5 4 = " + area(r));
    }

    public static void hello(String somebody) {
        //String somebody = "world";

        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(Square s) {
        return s.l * s.l;
    }

    public static double area(Rectangle r) {
        return r.a * r.b;
    }


}