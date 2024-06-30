package org.entropy;

public class FoodFactory extends Factory {
    @Override
    public Product createProduct() {
        return () -> System.out.println("foods");
    }
}
