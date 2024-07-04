package org.entropy;

import org.entropy.builder.Builder;
import org.entropy.builder.ComputerBuilder;
import org.entropy.director.Director;
import org.entropy.product.Computer;

public class Application {
    public static void main(String[] args) {
        Builder builder = new ComputerBuilder();
        Director director = new Director();
        Computer standardComputer = director.createStandardComputer(builder);
        System.out.println(standardComputer);
        System.out.println("I don't want this standard computer, I need super computer!");
        builder.reset();
        Computer superComputer = director.createSuperComputer(builder);
        System.out.println(superComputer);
    }
}
