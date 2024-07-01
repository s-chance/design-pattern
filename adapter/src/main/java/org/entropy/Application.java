package org.entropy;

public class Application {
    public static void main(String[] args) {
        USBAdapter usbAdapter = new USBAdapter(new USB());

        new Display().connect(usbAdapter);
    }
}
