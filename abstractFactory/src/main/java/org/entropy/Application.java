package org.entropy;

import org.entropy.constant.FruitEnum;
import org.entropy.constant.TypeEnum;
import org.entropy.constant.VegetableEnum;
import org.entropy.factory.AbstractFactory;

public class Application {
    public static void main(String[] args) {
        AbstractFactory
                .getFactory(TypeEnum.BIG)
                .createFruit(FruitEnum.APPLE)
                .description();
        AbstractFactory
                .getFactory(TypeEnum.SMALL)
                .createVegetable(VegetableEnum.BROCCOLI)
                .description();
    }
}
