package RecoverEverything;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter two number: ");

		int number1 = input.nextInt();

		int number2 = input.nextInt();

		System.out.println("even or odd mode:");
		String mode = input.next();

		if (number1 < number2) {

			for (int n = number1; n < number2; n++) {

				if (mode.equals("even") && n % 2 == 0) {

					System.out.println(n + " ");
				} else if (mode.equals("odd") && n % 2 == 1) {
					System.out.println(n + " ");

				}

			}

		} else if (number2 < number1) {

			for (int k = number2; k < number1; k++) {

				if (mode.equals("even") && k % 2 == 0) {

					System.out.println(k + " ");
				} else if (mode.equals("odd") && k % 2 == 1) {
					System.out.println(k + " ");

				}

			}
		} else

			System.out.println(number1);
	}

}
