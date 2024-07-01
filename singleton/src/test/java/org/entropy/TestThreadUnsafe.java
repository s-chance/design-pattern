package org.entropy;

import org.entropy.threadUnsafe.Singleton;

public class TestThreadUnsafe {
    public static void main(String[] args) {

        new Thread(() -> {
            Singleton instance = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + instance);
        }, "t1").start();

        new Thread(() -> {
            Singleton instance = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + instance);
        }, "t2").start();

        Singleton instance = Singleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + instance);
    }
}
