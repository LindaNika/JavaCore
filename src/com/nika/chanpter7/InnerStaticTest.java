package com.nika.chanpter7;

public class InnerStaticTest {
    private int a = 10;
    public int b = 20;
    private int ab = 30;

    Nested n = new Nested();

    public void process(){
        n.process();

        System.out.println("Outer:" + n.b);
    }

    private static class Nested{
        private int a = 100;
        public int b = 200;

        public void process(){
            System.out.println(a);
            System.out.println(b);
            //System.out.println(ab);
        }
    }

    public static void main(String [] args){
        InnerStaticTest test = new InnerStaticTest();
        test.process();

        Nested nested = new Nested();
        nested.process();

        //Nested n = Nested(); class cannot exist without parent, because it has access to parents fields

    }
}
