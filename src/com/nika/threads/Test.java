package com.nika.threads;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        MyRunnable runnable = new MyRunnable();
        Thread myRunnableThread = new Thread(runnable);
        myRunnableThread.start();

        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i <5; i++){
            System.out.println("main " + i);
            Thread.sleep(500);
        }

        myRunnableThread.join(100);
        System.out.println("myRunnableThread completed");
        myThread.join();
        //while (Thread.currentThread().isAlive()){

        //}
        System.out.println("main completed");
    }
}

class MyRunnable implements Runnable {

    public void run() {
        System.out.println("MyRunnable is run");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("MyRunnable " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyRunnable completed");
    }
}

class MyThread extends Thread{

    public void run() {
        System.out.println("MyThread is run");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("MyThread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread completed");
    }
}
