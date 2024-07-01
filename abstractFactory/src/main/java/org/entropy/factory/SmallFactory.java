package org.entropy.factory;

import org.entropy.constant.FruitEnum;
import org.entropy.constant.VegetableEnum;
import org.entropy.product.Fruit;
import org.entropy.product.Vegetable;

public class SmallFactory extends AbstractFactory {

    @Override
    public Fruit createFruit(FruitEnum fruit) {
        return switch (fruit) {
            case PEAR -> () -> System.out.println("small pear");
            case APPLE -> () -> System.out.println("small apple");
            case BANANA -> () -> System.out.println("small banana");
            case ORANGE -> () -> System.out.println("small orange");
        };
    }

    @Override
    public Vegetable createVegetable(VegetableEnum vegetable) {
        return switch (vegetable) {
            case CARROT -> () -> System.out.println("small carrot");
            case SPINACH -> () -> System.out.println("small spinach");
            case BROCCOLI -> () -> System.out.println("small broccoli");
            case CAULIFLOWER -> () -> System.out.println("small cauliflower");
        };
    }
}