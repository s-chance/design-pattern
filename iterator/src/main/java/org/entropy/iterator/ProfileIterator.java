package org.entropy.iterator;

import org.entropy.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile next();

    void reset();
}
