package org.entropy.component;

public class HardDrive {
    private int capacity;
    private String type;

    public HardDrive(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}
