package com.nika.chanpter7;

public class Test {

    public static void main(String [] args){
        Number number1 = new Integer(10);
        Number number2 = new Byte((byte)15);
        Number number3 = new Double(22);

        Integer number4 = new Integer(10);
        Byte number5 = new Byte((byte)15);
        Double number6 = new Double(22);

        Short number7 = new Short((short) 1);

        Test test = new Test();

        test.processNumber(number1);//Number
        test.processNumber(number2);//Number
        test.processNumber(number3);//Number

        test.processNumber(number4);//Integer
        test.processNumber(number5);//Byte
        test.processNumber(number6);//Double

        test.processNumber(number7);//Number

        int number8 = 10;
        double number9 = 10.2;

        test.processNumber(number8);//double
        test.processNumber(number9);//double

    }

    public void processNumber(Number number){
        System.out.println("Number:" + number);
    }

    public void processNumber(Integer number){
        System.out.println("Integer:" + number);
    }

    public void processNumber(Byte number){
        System.out.println("Byte:" + number);
    }

    public void processNumber(Double number){
        System.out.println("Double:" + number);
    }

    public void processNumber(double number){
        System.out.println("double:" + number);
    }
}
