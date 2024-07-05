package org.entropy.iterator;

import org.entropy.profile.Profile;
import org.entropy.socialNetwork.FaceBook;

import java.util.ArrayList;
import java.util.List;

public class FaceBookIterator implements ProfileIterator {
    private FaceBook faceBook;
    private String type;
    private String email;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public FaceBookIterator(FaceBook faceBook, String type, String email) {
        this.faceBook = faceBook;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if (emails.isEmpty()) {
            List<String> profiles = faceBook.requestProfileFriends(this.email, this.type);
            for (String profile : profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public Profile next() {
        if (!hasNext()) {
            return null;
        }

        String friendEmail = emails.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = faceBook.requestProfile(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
