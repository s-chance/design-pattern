package org.entropy;

public class Display {
    void connect(HDMI hdmi) {
        hdmi.connect();
        System.out.println("connected success!");
    }
}
