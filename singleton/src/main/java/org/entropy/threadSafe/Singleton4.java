package org.entropy.threadSafe;

public final class Singleton4 {
    private static volatile Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance != null) {
            return instance;
        }
        synchronized (Singleton4.class) {
            if (instance == null) {
                instance = new Singleton4();
            }
            return instance;
        }
    }
}
