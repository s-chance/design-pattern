package org.entropy;

import java.util.Objects;

public abstract class Shape {
    int x;
    int y;
    String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape shape)) {
            return false;
        } else {
            return shape.x == x && shape.y == y && Objects.equals(shape.color, color);
        }
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
