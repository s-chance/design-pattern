package org.entropy.socialNetwork;

import org.entropy.iterator.FaceBookIterator;
import org.entropy.iterator.ProfileIterator;
import org.entropy.profile.Profile;

import java.util.ArrayList;
import java.util.List;

public class FaceBook implements SocialNetwork {
    private List<Profile> profiles;

    public FaceBook(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        } else {
            this.profiles = new ArrayList<>();
        }
    }

    public Profile requestProfile(String profileEmail) {
        System.out.println("Facebook: Loading profile '" + profileEmail + "' over the network...");
        return findProfile(profileEmail);
    }


    public List<String> requestProfileFriends(String profileEmail, String contactType) {
        System.out.println("Facebook: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

        Profile profile = findProfile(profileEmail);
        if (profile != null) {
            return profile.getContact(contactType);
        }
        return null;
    }

    private Profile findProfile(String profileEmail) {
        for (Profile profile : profiles) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new FaceBookIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new FaceBookIterator(this, "coworkers", profileEmail);
    }
}
