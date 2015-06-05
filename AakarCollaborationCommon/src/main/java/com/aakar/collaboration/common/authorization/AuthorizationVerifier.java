package com.aakar.collaboration.common.authorization;

import com.aakar.collaboration.common.usermanagement.User;

public interface AuthorizationVerifier {
	public boolean hasApplicationRole(User user, String roleName);

	public boolean isMember(User user, String groupName);

	public boolean hasGroupRole(User user, String roleName, String groupName);
}
