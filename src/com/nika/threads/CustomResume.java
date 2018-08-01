package com.nika.threads;

import java.io.IOException;

public class CustomResume {
    public static void main(String[] args)  throws  InterruptedException{
        NewThread t1 = new NewThread("One");

        Thread.sleep(1000);
        t1.mySuspend();

        System.out.println("Thread Suspended");

        Thread.sleep(1000);
        t1.myResume();

        System.out.println("Thread Resumed");

    }

}

class NewThread implements Runnable{
    String name ;
    Thread t ;
    boolean suspendFlag ;

    NewThread(String name){
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New Thread Created");
        suspendFlag = false;
        t.start();
    }

    public void run(){
        try {
            for (int i = 15; i > 0; i--){
                System.out.println(name + " i:" + i);
                Thread.sleep(200);
                synchronized (this){
                    while (suspendFlag){
                        this.wait();
                    }
                }
            }
        }catch (InterruptedException | NullPointerException e){
            System.out.println(name + " resumed");
        }
    }

    synchronized void mySuspend(){
        suspendFlag = true;
    }

    synchronized void  myResume(){
        suspendFlag = false;
        notify();
    }
}