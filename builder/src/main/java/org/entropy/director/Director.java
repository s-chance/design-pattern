package org.entropy.director;

import org.entropy.builder.Builder;
import org.entropy.component.CPU;
import org.entropy.component.HardDrive;
import org.entropy.component.Memory;
import org.entropy.product.Computer;

public class Director {
    public Computer createStandardComputer(Builder builder) {
        return builder
                .setCPU(new CPU("Intel i5", "3.6", "8", "Intel"))
                .setMemory(new Memory(32, "DDR4"))
                .setHardDrive(new HardDrive(512, "SSD"))
                .build();
    }


    public Computer createSuperComputer(Builder builder) {
        return builder
                .setCPU(new CPU("Intel i9", "3.8", "16", "Intel"))
                .setMemory(new Memory(64, "DDR5"))
                .setHardDrive(new HardDrive(1024, "SSD"))
                .build();
    }
}
