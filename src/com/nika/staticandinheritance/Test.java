package com.nika.staticandinheritance;

public class Test {
    public static void main(String[] args) {
        printInfo();

        Parent p = new Parent();

        printInfo();

        Child1 c1 = new Child1();

        printInfo();

        Child2 c2 = new Child2();

        printInfo();
    }

    public static void printInfo() {
        System.out.println("Parent:" + Parent.count);
        System.out.println("Child1:" + Child1.count);
        System.out.println("Child2:" + Child2.count);
    }
}
