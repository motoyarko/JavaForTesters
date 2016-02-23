package com.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {

        hello("world!!!!");
        hello("user");

        Square s = new Square(7);
        System.out.println("area 7 = " + s.area());

        Rectangle r = new Rectangle(5, 4);
        System.out.println("area 5 4 = " + r.area());
    }

    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + "!");
    }


}