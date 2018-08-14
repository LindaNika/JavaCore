package com.nika.lambda;

public class Test {

    public static void main(String args[]) {
        MyNumber m = () -> 10;
        System.out.println(m.getNum());

        MyNumberPar p = n -> n * 2;
        System.out.println(p.getNum(2));

        MyNumberPar p2 = n -> {
            if (n > 0) {
                return n * 2;
            } else {
                return n * (-2);
            }
        };
        System.out.println(p2.getNum(-5));

        MyNumberFun f = (a)-> a;//Object
        MyNumberFun<String> f1 = (a)-> a;
        MyNumberFun<Integer> f2 = (a)-> a;

        int num = 10;

        MyNumber mn = () -> {
            //num++;//Is not supported
            return num;
        };

        String s1 = "abs";
        String s2 = "abs";

        System.out.println(s1 == s2);

        //num++;//Is not supported

    }
}

@FunctionalInterface
interface MyNumber {
    int getNum();
}

@FunctionalInterface
interface MyNumberPar {
    int getNum(int a);
}

@FunctionalInterface
interface MyNumberFun<T> {
    T getNum(T t);
}
