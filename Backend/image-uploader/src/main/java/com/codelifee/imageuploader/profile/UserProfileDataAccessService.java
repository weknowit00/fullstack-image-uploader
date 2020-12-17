package com.codelifee.imageuploader.profile;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.codelifee.imageuploader.datastore.FakeUserProfileDataStore;

@Repository
public class UserProfileDataAccessService {

	private final FakeUserProfileDataStore fakeUserProfileDataStore;
	
	@Autowired
	public UserProfileDataAccessService(FakeUserProfileDataStore fakeUserProfileDataStore) {
		this.fakeUserProfileDataStore = fakeUserProfileDataStore;
	}
	
	List <UserProfile> getUserProfiles() {
		return fakeUserProfileDataStore.getUserProfiles();
	}
	
	public void uploadUserProfileImage(UUID userProfileId, MultipartFile file) {
		// 1. Check if image is not empty
		// 2. if file is an image
		// 3. the user exists in out database
		// 4. grab some metadata from file if any
		// 5. store the image in s3 and update database with s3 image link
		
		
	}
}
