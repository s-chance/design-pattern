package org.entropy;

@FunctionalInterface
public interface PayStrategy {
    void pay(int paymentAmount);
}
