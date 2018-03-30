package sweatoversomething;

import java.util.*;

public class LoginValidator {

	public static void main(String[] args) {

		String validUsername = "cybertek";
		String validPassword = "omar123";

		Scanner input = new Scanner(System.in);
		// get username
		System.out.println("Enter username:");
		String userName = input.nextLine();
		// get password
		System.out.println("Enter password:");
		String password = input.nextLine();

		if (userName.equals(validUsername) && password.equals(validPassword)) {

			System.out.println("login Successfull");
			
		} else {
			
			if (userName.isEmpty() || password.isEmpty()) {

				if (userName.isEmpty()) {
					System.out.println("username cannot be blank");
				}
				if (password.isEmpty()) {

					System.out.println("password cannot be blank");
				}

			} else {
				
				if (!password.equals(validPassword)) {

					System.out.println("invalid password");
				}
				if (!password.equals(validUsername)) {

					System.out.println("invalid username");
				}
				
			}
		}

	}

}
