package org.entropy;

import org.entropy.cacheProxy.CachedMovie;
import org.entropy.thirdPartyService.MovieService;

public class Application {
    public static void main(String[] args) {
        MovieService cachedMovie = new CachedMovie("Interstellar");

        long start = System.nanoTime();
        cachedMovie.play();
        long end = System.nanoTime();
        System.out.println("Time taken " + (end - start) / 1000_000 + "ms");

        start = System.nanoTime();
        cachedMovie.play();
        end = System.nanoTime();
        System.out.println("Time taken by cached proxy " + (end - start) / 1000_000 + "ms");
    }
}
