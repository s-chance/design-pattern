package org.entropy;

public class DrinkFactory extends Factory {
    @Override
    public Product createProduct() {
        return () -> System.out.println("drinks");
    }
}
