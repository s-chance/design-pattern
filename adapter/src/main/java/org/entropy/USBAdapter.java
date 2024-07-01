package org.entropy;

public class USBAdapter extends HDMI {
    private final USB usb;

    public USBAdapter(USB usb) {
        this.usb = usb;
    }

    @Override
    void connect() {
        System.out.println(this + ": usb to hdmi");
        usb.connect();
    }
}
