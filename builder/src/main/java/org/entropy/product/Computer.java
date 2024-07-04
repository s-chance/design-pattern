package org.entropy.product;

import org.entropy.component.CPU;
import org.entropy.component.HardDrive;
import org.entropy.component.Memory;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", memory=" + memory +
                ", hardDrive=" + hardDrive +
                '}';
    }
}
