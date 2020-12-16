package com.codelifee.imageuploader.profile;

import java.util.Objects;
import java.util.UUID;

public class UserProfile {

	private UUID userProfileId;
	private String username;
	private String userProfileImageLink; // S3 key
	
	public UserProfile(UUID userProfileId, String username, String userProfileImageLink) {
		super();
		this.userProfileId = userProfileId;
		this.username = username;
		this.userProfileImageLink = userProfileImageLink;
	}

	public UUID getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(UUID userProfileId) {
		this.userProfileId = userProfileId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserProfileImageLink() {
		return userProfileImageLink;
	}

	public void setUserProfileImageLink(String userProfileImageLink) {
		this.userProfileImageLink = userProfileImageLink;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userProfileId == null) ? 0 : userProfileId.hashCode());
		result = prime * result + ((userProfileImageLink == null) ? 0 : userProfileImageLink.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserProfile other = (UserProfile) obj;
		
		
		return Objects.equals(userProfileId, other.userProfileId) &&
			   Objects.equals(username, other.username) &&
			   Objects.equals(userProfileImageLink, other.userProfileImageLink);
	}
	
	
}
