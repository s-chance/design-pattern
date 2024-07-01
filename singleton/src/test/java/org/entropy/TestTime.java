package org.entropy;

import org.entropy.threadSafe.Singleton2;
import org.entropy.threadUnsafe.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestTime {
    public static void main(String[] args) throws InterruptedException {
        int numThreads = 100;
        test1(numThreads);
        test2(numThreads);
    }

    static void test1(int numThreads) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        long startTime = System.nanoTime();
        for (int i = 0; i < numThreads; i++) {
            executor.execute(() -> {
                for (int j = 0; j < 1000_000; j++) {
                    Singleton.getInstance();
                }
            });
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000;
        System.out.println("Time taken for Singleton: " + duration + " ms");
    }

    static void test2(int numThreads) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        long startTime = System.nanoTime();
        for (int i = 0; i < numThreads; i++) {
            executor.execute(() -> {
                for (int j = 0; j < 1000_000; j++) {
                    Singleton2.getInstance();
                }
            });
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000;
        System.out.println("Time taken for Singleton2: " + duration + " ms");
    }
}
