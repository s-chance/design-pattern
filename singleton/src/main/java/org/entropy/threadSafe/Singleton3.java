package org.entropy.threadSafe;

public final class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {}

    public static Singleton3 getInstance() {
        return instance;
    }
}
