package org.entropy;

public abstract class Factory {
    public abstract Product createProduct();

    protected void description() {
        Product product = this.createProduct();
        product.description();
    }

    public static Factory getFactory(String type) {
        if ("foods".equals(type)) {
            return new FoodFactory();
        } else if ("drinks".equals(type)) {
            return new DrinkFactory();
        } else {
            return new Factory() {
                @Override
                public Product createProduct() {
                    return () -> System.out.println("default");
                }
            };
        }
    }
}
