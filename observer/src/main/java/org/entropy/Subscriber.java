package org.entropy;

@FunctionalInterface
public interface Subscriber {
    void update(String msg);
}
