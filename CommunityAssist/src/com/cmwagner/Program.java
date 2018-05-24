package com.cmwagner;
import java.util.Scanner;

public class Program {
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		Register r = new Register();
		
		Login l = new Login(r.getUserName(), r.getPassword());
		
		System.out.println("Please log in");
		System.out.println("Enter username");
		String inputUserName = scan.nextLine();
		System.out.println("Enter password");
		String inputPassword = scan.nextLine();
		
		if (l.checkCredentials(inputUserName, inputPassword) == false) {
			System.out.println("Wrong username or password");
			
		}
		else {
			System.out.println("Successful login! Congratulations!");
			
			System.out.println("Would you like to donate today (Y/N)?");
			String answer = scan.nextLine();
			if (answer.equals("Y")) {
				System.out.println("Thank you! How much would you like to donate?");
				float amount = scan.nextFloat();
				Donation d = new Donation();
				d.setAmount(amount);
				System.out.println("Thank you for your generous donation!");
			}
			else if (answer.equals("N")) {
				System.out.println("Thanks for your consideration. Please come back later");
			}
			else {
				System.out.println("Invalid entry");
			}
		}
	}
}
