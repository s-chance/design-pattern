package org.entropy.computer;

import org.entropy.visitor.ComputerPartVisitor;

public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{
                new Mouse(),
                new KeyBoard(),
                new Monitor()
        };
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
