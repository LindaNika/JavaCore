package com.nika.enums;

public class Test {

    public static void main(String[] args){
        System.out.println("Test");

        Color c = null;
       System.out.println(c);

      c =  Color.RED;
    }

}

enum Color{
    RED(1), GREEN(1,2);

    int a;
    int b;

    Color(int a){
        this.a = a;
        System.out.println("Constructor 1");
    }

    Color(int a, int b){
        this.a = a;
        this.b = b;

        System.out.println("Constructor 2");
    }
}