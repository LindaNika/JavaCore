package com.nika.generics;

import java.util.ArrayList;
import java.util.List;

public class SimpleExample<T> {
    T obj;

    SimpleExample(T t){
        this.obj = t;
    }

    T getObj(){
        return obj;
    }

    public static void main(String [] args) {
        SimpleExample<String> s = new SimpleExample<>("Hello World");
        String a = s.getObj();

        System.out.println(a);

        SimpleExample<int[]> ss = new SimpleExample<>(new int[]{1, 2});
        System.out.println(ss.getObj());

        SimpleExample<Number> n = new SimpleExample<>(new Integer(2));

        perform1(n);
        perform1(new SimpleExample<>(new Long(1)));

        perform2(new SimpleExample<>(new Integer(1)));
        perform2(new SimpleExample<>(n));

        List<? extends Number> list = new ArrayList<Number>();
        for (Number element : list) {
            System.out.println(element);
            List<? super Integer> list2 = new ArrayList<Number>();
            /*for (Number element2 : list2) {
                System.out.println(element2);
            }*/
        }
    }

    public static void perform1(SimpleExample<? extends Number> a){

    }

    public static void perform2(SimpleExample<? super Number> a){

    }

    public void method1(T t){
        //System.out
    }

}

class Test{
    public<T extends Integer, V extends T> T method1(T t, V v){
        System.out.println(t);

        return t;
    }
}
