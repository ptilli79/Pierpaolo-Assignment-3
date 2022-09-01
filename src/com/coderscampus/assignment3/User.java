package com.coderscampus.assignment3;

public class User {
	
	// instance variables (declared as private)
			private String username;
			private String password;
			private String firstName;
			private String lastName;
			private String fullName;
			private String name;
			private int unsuccessfulLoginAttempts;

			// getters and setters for the above instance variables
			public String getUsername() {
				return username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getFirstName() {
				return firstName;
			}

			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

			public String getLastName() {
				return lastName;
			}

			public void setLastName(String lastName) {
				this.lastName = lastName;
			}

			public String getFullName() {
				return fullName;
			}

			public void setFullName(String fullName) {
				this.fullName = fullName;
			}
			
			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}
			public int getUnsuccessfulLoginAttempts() {
				return unsuccessfulLoginAttempts;
			}

			public void setUnsuccessfulLoginAttempts(int unsuccessfulLoginAttempts) {
				this.unsuccessfulLoginAttempts = unsuccessfulLoginAttempts;
			}
			public String getBasicUserInfo() {
				return ("Username: " + username + " Password: " + password + " Name: " + name);
			}

}
