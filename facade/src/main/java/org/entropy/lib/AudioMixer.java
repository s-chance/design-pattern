package org.entropy.lib;

public class AudioMixer {
    public void addAudio(Video video) {
        System.out.println("add audio to the " + video);
        video.setAudio("this is audio");
    }
}
