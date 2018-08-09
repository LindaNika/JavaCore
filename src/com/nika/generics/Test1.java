package com.nika.generics;

public class Test1 {
    public static void main(String [] args){
        B<Integer, String> b = new B();
        b.set("");
    }
}

class A<T>{
    T t;

    public T getT(){
        return t;
    }
}

class B<T extends Number, V> extends A<T>{
    V v;
    public void set(T t){
        System.out.println("T");
    }

    public void set(V v){
        System.out.println("V");
    }
}