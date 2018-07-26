package com.nika.interfaces;

interface DefaultInt {

    void doMagic();

    default void doMagic2(){
        System.out.println("Default Magic");
    }
}
