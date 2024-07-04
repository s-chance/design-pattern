package org.entropy.builder;

import org.entropy.component.CPU;
import org.entropy.component.HardDrive;
import org.entropy.component.Memory;
import org.entropy.product.Computer;

public interface Builder {

    Builder setCPU(CPU cpu);
    Builder setMemory(Memory memory);
    Builder setHardDrive(HardDrive hardDrive);

    Computer build();

    void reset();
}
