package org.entropy;

import org.entropy.threadUnsafe.Singleton;

public class Application {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1);
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2);
    }
}
