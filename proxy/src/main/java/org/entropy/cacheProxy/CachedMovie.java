package org.entropy.cacheProxy;

import org.entropy.thirdPartyService.OriginalMovie;
import org.entropy.thirdPartyService.MovieService;

public class CachedMovie implements MovieService {
    private OriginalMovie movie;
    private String name;

    public CachedMovie(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        if (movie == null) {
            movie = new OriginalMovie(name);
        }
        movie.play();
    }
}
