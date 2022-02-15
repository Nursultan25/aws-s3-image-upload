package com.example.awsimageupload.datastore;

import com.example.awsimageupload.model.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("ff64a673-887d-4b51-a393-03e5ea7d9ea4"), "janesjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("058bf5e4-91c0-4232-85bf-31883055c197"), "antonchigur", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
