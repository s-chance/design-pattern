package org.entropy.lib;

public class CaptionMixer {
    public void addCaption(Video video) {
        System.out.println("add caption to the " + video);
        video.setCaption("this is caption");
    }
}
