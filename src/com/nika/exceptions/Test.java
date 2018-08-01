package com.nika.exceptions;

public class Test {
    public static void main(String[] args) throws Throwable {
        try {
            throw new Throwable();
        } catch (Throwable e) {
            System.out.println("Catch");
        }
    }
}
