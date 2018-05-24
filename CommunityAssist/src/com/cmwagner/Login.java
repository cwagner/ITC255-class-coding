package com.cmwagner;


public class Login {
	private String userName;
	private String password;
	
	public Login(String userName, String password) {
			setUserName(userName);
			setPassword(password);
		}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean checkCredentials(String inputUserName, String inputPassword) {
		if (inputUserName.equals(userName) && inputPassword.equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
