package com.nika.interfaces;

public interface Int1 {
    void method1();

    default void method2(){
        System.out.println("Int1 default method 2");
    }

    void method3();

    default void method4(){
        System.out.println("Int1 default method 4");
    }

    public static void staticMagic(){
        System.out.println("Static Magic");
    }
}
