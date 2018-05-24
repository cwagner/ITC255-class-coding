package com.cmwagner;
import java.util.Scanner;

public class Register {
	private String userName;
	private String password;
	Scanner scan = new Scanner(System.in);
	
	public Register() {
		System.out.println("Enter username");
		setUserName(scan.nextLine());
		System.out.println("Enter password");
		setPassword(scan.nextLine());
		System.out.println("Welcome " + userName + "!");
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
