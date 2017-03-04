package com.sdajava.thread;

public class Main {

    public static void main(String[] args) {
        MultiThread m1 = new MultiThread(0,111);
        m1.start();

        MultiThread m2 = new MultiThread(1,222);
        m2.start();

        MultiThread m3 = new MultiThread(2, 333);
        m3.start();

        MultiThread m4 = new MultiThread(3,444);
        m4.start();

    }
}
