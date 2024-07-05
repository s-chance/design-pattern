package org.entropy;

public class Application {
    public static void main(String[] args) {
        ShapeCache shapeCache = new ShapeCache();
        Shape shape1 = shapeCache.get("big green circle");
        Shape shape2 = shapeCache.get("medium orange rectangle");
        Shape shape3 = shapeCache.get("medium orange rectangle");

        System.out.println(shape1 == shape2);
        System.out.println(shape1.equals(shape2));
        System.out.println(shape2 == shape3);
        System.out.println(shape2.equals(shape3));
    }
}
