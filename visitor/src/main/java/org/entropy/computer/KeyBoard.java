package org.entropy.computer;

import org.entropy.visitor.ComputerPartVisitor;

public class KeyBoard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
