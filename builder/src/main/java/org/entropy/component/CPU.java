package org.entropy.component;

public class CPU {
    private String core;
    private String frequency;
    private String cache;
    private String brand;

    public CPU(String core, String frequency, String cache, String brand) {
        this.core = core;
        this.frequency = frequency;
        this.cache = cache;
        this.brand = brand;
    }

    public String getCore() {
        return core;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getCache() {
        return cache;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "core='" + core + '\'' +
                ", frequency='" + frequency + '\'' +
                ", cache='" + cache + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
