package org.entropy.thirdPartyService;

import java.util.concurrent.TimeUnit;

public class OriginalMovie implements MovieService {
    private String name;

    public OriginalMovie(String name) {
        this.name = name;
        load(name);
    }

    @Override
    public void play() {
        System.out.println("playing the movie");
        System.out.println("start playing...");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("stop playing...");
    }

    private void load(String name) {
        System.out.println("loading " + name + "...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("loaded success!");
    }
}
