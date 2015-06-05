package com.aakar.collaboration.common.groupmanagement;

import java.util.List;

public interface GroupManager {

	public void createGroup(Group group);

	public void createGroups(List<Group> groupList);

	public void removeGroup(Group group);

	public void removeGroups(List<Group> groupList);
}
