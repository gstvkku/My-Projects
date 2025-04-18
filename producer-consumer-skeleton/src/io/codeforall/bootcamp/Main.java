package io.codeforall.bootcamp;

import io.codeforall.bootcamp.bqueue.BQueue;
import io.codeforall.bootcamp.bqueue.Pizza;

public class Main {

    public static void main(String[] args) {

        BQueue<Pizza> queue = new BQueue<>(3);

        Producer p1 = new Producer(queue, 2);
        Thread t1 = new Thread(p1);
        t1.setName("p1");

        Producer p2 = new Producer(queue, 2);
        Thread t2 = new Thread(p2);
        t2.setName("p2");

        Consumer c1 = new Consumer(queue, 2);
        Thread t3 = new Thread(c1);
        t3.setName("c1");

        Consumer c2 = new Consumer(queue, 2);
        Thread t4 = new Thread(c2);
        t4.setName("c2");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

