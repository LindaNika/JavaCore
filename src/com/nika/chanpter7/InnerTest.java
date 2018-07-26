package com.nika.chanpter7;

public class InnerTest {
    private int a = 10;
    public int b = 20;
    private int ab = 30;

    Nested n = new Nested();

    public void process(){
        n.process();

        System.out.println("Outer:" + n.b);
    }

    public class Nested{
        private int a = 100;
        public int b = 200;

        public void process(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(ab);
        }
    }

    public static void main(String [] args){
        InnerTest test = new InnerTest();
        test.process();

        //Nested n = Nested(); class cannot exist without parent, because it has access to parents fields

    }
}
