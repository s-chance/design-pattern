package org.entropy.threadSafe;

public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    // just add synchronized
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
