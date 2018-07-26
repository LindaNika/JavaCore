package com.nika.interfaces;

public interface DefaultInt2 {
    void doMagic();

    default void doMagic2(){
        System.out.println("Default Magic2");
    }
}
