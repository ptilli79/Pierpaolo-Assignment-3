package com.coderscampus.assignment3;

public class UserService {
	
	
		
		public User createUser (String userInfo[]) {
			User user = new User();
			user.setUsername(userInfo[0]);
			user.setPassword(userInfo[1]);
			user.setName(userInfo[2]);
			return user;
		}
}
