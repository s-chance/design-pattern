package org.entropy.visitor;

import org.entropy.computer.Computer;
import org.entropy.computer.KeyBoard;
import org.entropy.computer.Monitor;
import org.entropy.computer.Mouse;

public interface ComputerPartVisitor {
    void visit(KeyBoard keyBoard);
    void visit(Mouse mouse);
    void visit(Monitor monitor);
    void visit(Computer computer);
}
