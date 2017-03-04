package com.sdajava.thread;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by RENT on 2017-02-28.
 */
    public class MultiThread extends Thread {

    public int id;
    public int number;

    public MultiThread(int id, int number) {
        this.id = id;
        this.number = number;
    }

    @Override
    public void run() {

        for (int i = 0; i < number; i++)
            try {
                Thread.sleep(number);
            } catch (InterruptedException a) {}
                System.out.println("Thead is running ...  " + id);
            }
    }
