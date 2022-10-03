package com.coderscampus.assignment3;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		UserService userService = new UserService();
		Scanner scanner = new Scanner(System.in);
		UserLoginApp userLogin = new UserLoginApp();
		//UserInfo userInfo = new UserInfo();
				
		int i = 0; 
		int line_counter=0; //auxiliary line counter
		int valid_attempts = 0;
		int userInput = -1;
		String[] arr = new String[3]; //User attributes array: Username, Password and Name
		BufferedReader fileReader = null;
		LineNumberReader lnr  = null; //file line counter, as to determine the size of user array
		try { 
			//File f = new File(dataPath(""), "/image1.jpg");
			String workingDir = System.getProperty("user.dir");
			//System.out.println(workingDir);
			workingDir=workingDir+"/data/assignment3-data.txt";
			//fileReader = new BufferedReader(new FileReader("C:/Users/pierp/OneDrive/Documentos/MyRepository/PreloadBuild/Output/assignment3-data.txt"));
			fileReader = new BufferedReader(new FileReader(workingDir));	
			lnr = new LineNumberReader(fileReader);
			while ((lnr.readLine()) != null);
//			System.out.println("File line number: " + lnr.getLineNumber());
			line_counter=lnr.getLineNumber();
			//Create array user based on line counter value
		}
				
		 finally {
			//System.out.println("Closing file reader and lnr couter");
			lnr.close();
			fileReader.close();
		}
		
		
		if (line_counter>0) {
		
			User users[] = new User[line_counter];
			String workingDir = System.getProperty("user.dir");
			workingDir=workingDir+"/data/assignment3-data.txt";
			//fileReader = new BufferedReader(new FileReader("C:/Users/pierp/OneDrive/Documentos/MyRepository/PreloadBuild/Output/assignment3-data.txt"));
			fileReader = new BufferedReader(new FileReader(workingDir));
			String line = "";
			while ((line = fileReader.readLine()) != null) {
//				System.out.println(line);	
				arr=line.split(",");
				users[i] = userService.createUser(arr);
				i++;	
			}
		
//			for (User arg : users) {
//				System.out.println(arg.getBasicUserInfo());
//			}

			while (valid_attempts < 5 && userInput == -1) {	
				userInput=userLogin.readInput(valid_attempts,scanner, users);
 
				if (userInput == -1 && valid_attempts < 4) {
					System.out.println("Attempt: " + (valid_attempts+1)+ ". Invalid login, please try again!");
				}
				if(valid_attempts==3 && userInput == -1) {
					System.out.println("This is your last chance!");
				}
 
				valid_attempts++;
			}
			
		} //"if" closing curly brackets
		
        scanner.close();
        fileReader.close();
        
        if (userInput == -1 && valid_attempts >= 5) {
        	System.out.println("Too many failed login attempts ("+valid_attempts+"), you are now locked out!");

        }

	}

}
