package org.tnsindia.customexception;
import java.util.Scanner;

//Custom Exception for validating the Login credentials
class LoginCredentials extends Exception
{
	public String str;

	//constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
}

