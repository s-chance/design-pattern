package org.entropy.factory;

import org.entropy.constant.FruitEnum;
import org.entropy.constant.TypeEnum;
import org.entropy.constant.VegetableEnum;
import org.entropy.product.Fruit;
import org.entropy.product.Vegetable;

public abstract class AbstractFactory {
    public abstract Fruit createFruit(FruitEnum fruit);

    public abstract Vegetable createVegetable(VegetableEnum vegetable);

    public static AbstractFactory getFactory(TypeEnum type) {
        return switch (type) {
            case BIG -> new BigFactory();
            case SMALL -> new SmallFactory();
            default -> throw new IllegalArgumentException("unknown type");
        };
    }
}
