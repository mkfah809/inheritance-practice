package com.coderscampus.base;

public class SuperUser extends User {
	public SuperUser() {
		SuperUserReadGrant("Read Access is granted");
		SuperUserWriteGrant("Write Access is granted");
		SuperUserSuperGrant("Super User Access is granted");

	}

	private void SuperUserReadGrant(String messagePrint) {
		setReadAccess(true);
		getReadAccess();
	}

	private void SuperUserWriteGrant(String messagePrint) {
		setWriteAccess(true);
		getWriteAccess();
	}

	private void SuperUserSuperGrant(String messagePrint) {
		setSuperUser(true);
		getSuperUser();
	}
}
