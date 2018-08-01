package com.nika.threads;

public class TestSynchMethod {
    public static void main(String[] args) throws InterruptedException {

        MyThread1 myThread1_1 = new MyThread1("Non_1");
        MyThread1 myThread1_2 = new MyThread1("Non_2");
        myThread1_1.start();
        myThread1_2.start();

        myThread1_1.join();
        myThread1_2.join();

        MyThread2 myThread2_1 = new MyThread2("Syncked1");
        MyThread2 myThread2_2 = new MyThread2("Syncked2");
        myThread2_1.start();
        myThread2_2.start();

        myThread2_1.join();
        myThread2_1.join();

    }

}

class MyThread1 extends Thread{

    public MyThread1(String name){
        super(name);
    }

    public void run() {
        System.out.println("[" + this.getName());
        try {

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("]");
    }
}

class MyThread2 extends Thread{

    public MyThread2(String name){
        super(name);
    }

    public void run() {
        System.out.println("[" + this.getName());
        try {

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("]");
    }
}