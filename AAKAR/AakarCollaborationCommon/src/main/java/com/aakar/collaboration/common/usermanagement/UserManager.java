package com.aakar.collaboration.common.usermanagement;

import java.util.List;

public interface UserManager {

	public void createUser(User user);

	public void createUsers(List<User> userList);

	public void removeUser(User user);

	public void removeUsers(List<User> userList);
}
