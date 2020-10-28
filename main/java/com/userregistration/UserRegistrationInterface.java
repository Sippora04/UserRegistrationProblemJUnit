package com.userregistration;

@FunctionalInterface
public interface UserRegistrationInterface {
	//interface
	public boolean validate(String pattern, String userDetails);
}
