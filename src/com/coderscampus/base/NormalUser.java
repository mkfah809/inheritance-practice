package com.coderscampus.base;

public class NormalUser extends User {

	public NormalUser() {
		normalUserReadGrant("Read Access is granted");
		normalUserWriteGrant("Write Access is granted");
		normalUserSuperGrant("Super User Access is denied");
	}

	private void normalUserReadGrant(String messageConsole) {
		setReadAccess(true);
		getReadAccess();
	}

	private void normalUserWriteGrant(String messageConsole) {
		setWriteAccess(true);
		getWriteAccess();
	}

	private void normalUserSuperGrant(String messageConsole) {
		setSuperUser(false);
		getSuperUser();
	}

}
