package RecoverEverything;

import java.util.*;

public class Chopper {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("String to chop:");

		String word = input.next();// java

		for (int i = 0; i < word.length(); i += 3) {

			if (i + 2 < word.length()) {

				System.out.println(word.charAt(i) + "" + word.charAt(i + 1) + "" + word.charAt(i + 2));
			} else {

				System.out.println(word.charAt(i));
			}
		}

	}

}
