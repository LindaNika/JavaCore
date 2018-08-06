package com.nika.generics;

public class SimpleExample<T> {
    T obj;

    SimpleExample(T t){
        this.obj = t;
    }

    T getObj(){
        return obj;
    }

    public static void main(String [] args){
        SimpleExample<String> s = new SimpleExample<>("Hello World");
        String a = s.getObj();

        System.out.println(a);

        SimpleExample<int[]> ss = new SimpleExample<>(new int[] {1, 2});
        System.out.println(ss.getObj());

        SimpleExample<Number> n = new SimpleExample<>(new Integer(2));

        //perform1(new SimpleExample<>(n));
        perform1(new SimpleExample<>(new Long(1)));

        perform2(new SimpleExample<>(new Integer(1)));
        perform2(new SimpleExample<>(n));
    }

    public static void perform1(SimpleExample<? extends Number> a){

    }

    public static void perform2(SimpleExample<? super Number> a){

    }

}
