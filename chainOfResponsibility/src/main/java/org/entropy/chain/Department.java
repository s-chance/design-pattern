package org.entropy.chain;

public interface Department {
    void execute(Patient patient);

    void setNext(Department department);
}
