package com.coderscampus.assignment3;

import java.util.Scanner;

public class UserLoginApp {
	
	int readInput (int valid_attempts, Scanner scanner, User[] users) {


	int resultMatch = -1;
	String[] userInput = new String[2];
	
	System.out.println("Please, type your username: ");
	userInput[0] = scanner.nextLine();
	System.out.println("Please, type your password: ");
	userInput[1] = scanner.nextLine();
		
	for (User arg : users) {
		if (arg.getUsername().equals(userInput[0].toLowerCase()) && arg.getPassword().equals(userInput[1])) {
			resultMatch = 1;
			System.out.println("Successful Login! Welcome: " + arg.getName());
			break;	 
		}
	}
		
	return resultMatch;

	}

}
