package org.entropy.computer;

import org.entropy.visitor.ComputerPartVisitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
