package org.entropy.builder;

import org.entropy.component.CPU;
import org.entropy.component.HardDrive;
import org.entropy.component.Memory;
import org.entropy.product.Computer;

public class ComputerBuilder implements Builder {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
    private boolean isBuilt;

    public ComputerBuilder() {
        isBuilt = false;
    }

    @Override
    public Builder setCPU(CPU cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public Builder setMemory(Memory memory) {
        this.memory = memory;
        return this;
    }

    @Override
    public Builder setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
        return this;
    }

    @Override
    public Computer build() {
        if (isBuilt) {
            throw new IllegalStateException("Cannot build twice without resetting.");
        }
        isBuilt = true;
        return new Computer(cpu, memory, hardDrive);
    }

    @Override
    public void reset() {
        cpu = null;
        memory = null;
        hardDrive = null;
        isBuilt = false;
    }
}
