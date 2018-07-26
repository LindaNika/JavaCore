package com.nika.interfaces;

public class DefaultTest implements DefaultInt, DefaultInt2 {
    @Override
    public void doMagic() {
        System.out.println("Class Magic");
    }
    public void doMagic2() {//need to implement, bacause both interfaces have such method
        System.out.println("Class Magic 2");
    }


    public static void main(String [] args){
        System.out.println("A---------------");
        A a = new A();
        a.method1();
        a.method2();
        a.method3();
        a.method4();


        System.out.println("B---------------");
        B b = new B();
        b.method1();
        b.method2();
        b.method3();
        b.method4();

        System.out.println("C---------------");
        C c = new C();

        c.method1();
        c.method2();
        c.method3();
        c.method4();
    }
}

class A implements Int1
{
    @Override
    public void method1() {
        System.out.println("A method1");
    }

    @Override
    public void method3() {
        System.out.println("A method3");
    }
}

class B implements Int2
{
    @Override
    public void method1() {
        System.out.println("B method1");
    }

    @Override
    public void method3() {
        System.out.println("B method3");
    }
}

class C implements Int1, Int2
{
    @Override
    public void method1() {
        System.out.println("C method1");
    }

    @Override
    public void method3() {
        System.out.println("C method3");
    }
}