package com.nika.interfaces;

public interface Int2 extends Int1{

    void method1();

    default void method2(){
        System.out.println("Int2 default method 2");
    }

    default void method4(){
        Int1.super.method4();
        //Int1.super.method1();//abstract method cannot be accesed directly
    }
}
