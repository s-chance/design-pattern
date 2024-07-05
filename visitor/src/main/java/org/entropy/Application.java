package org.entropy;

import org.entropy.computer.Computer;
import org.entropy.computer.ComputerPart;
import org.entropy.visitor.ComputerPartDisplayVisitor;

public class Application {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
