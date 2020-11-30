package com.org.exercise;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<>();
		users.add(new User(1, "Andrew", "zxcvbn"));
		users.add(new User(2, "Suriya", "zxcvbn"));
		users.add(new User(3, "Prakash", "zxcvbn"));
		users.add(new User(4, "John", "zxcvbn"));
		users.add(new User(5, "Arthur", "zxcvbn"));
		
		for (User user : users) {
			if(user.getName().length()>5)
				System.out.println(user.getName());
		}
	}
}
