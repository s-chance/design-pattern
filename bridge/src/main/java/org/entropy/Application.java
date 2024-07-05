package org.entropy;

import org.entropy.device.Device;
import org.entropy.device.Radio;
import org.entropy.device.Tv;
import org.entropy.remote.BasicRemoteControl;

public class Application {
    public static void main(String[] args) {
        testDevice(new Radio());
        testDevice(new Tv());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemoteControl basicRemote = new BasicRemoteControl(device);
        basicRemote.power();
        basicRemote.channelUp();
        device.printStatus();
    }
}
