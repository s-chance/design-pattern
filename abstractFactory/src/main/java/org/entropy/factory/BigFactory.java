package org.entropy.factory;

import org.entropy.constant.FruitEnum;
import org.entropy.constant.VegetableEnum;
import org.entropy.product.Fruit;
import org.entropy.product.Vegetable;

public class BigFactory extends AbstractFactory {

    @Override
    public Fruit createFruit(FruitEnum fruit) {
        return switch (fruit) {
            case PEAR -> () -> System.out.println("big pear");
            case APPLE -> () -> System.out.println("big apple");
            case BANANA -> () -> System.out.println("big banana");
            case ORANGE -> () -> System.out.println("big orange");
        };
    }

    @Override
    public Vegetable createVegetable(VegetableEnum vegetable) {
        return switch (vegetable) {
            case CARROT -> () -> System.out.println("big carrot");
            case SPINACH -> () -> System.out.println("big spinach");
            case BROCCOLI -> () -> System.out.println("big broccoli");
            case CAULIFLOWER -> () -> System.out.println("big cauliflower");
        };
    }
}
