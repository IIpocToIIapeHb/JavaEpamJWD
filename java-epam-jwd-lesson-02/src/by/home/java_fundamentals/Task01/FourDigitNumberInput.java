package by.home.java_fundamentals.Task01;

import java.util.Scanner;

public class FourDigitNumberInput {

	public int readFourDigitInt() {

		int fourDigitNumber = 0;

		Scanner scanner = new Scanner(System.in);

		int intNumber = readInt(scanner);

		while (!isFourDigitInt(intNumber)) {
			System.out.println("Вы ввели не четырхзначное число. Попробуйте еще раз");
			fourDigitNumber = readInt(scanner);
		}

		return fourDigitNumber;

	}

	// method that requests and returns an integer number
	private int readInt(Scanner scanner) {

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Вы ввели не целое чиcло. Попробуйте еще раз");
		}
		return scanner.nextInt();
	}

	// method that checks if the parameter is a four-digit number
	private boolean isFourDigitInt(int number) {

		boolean result = false;

		if (number / 1000 > 0 && number / 1000 < 10) {
			result = true;
		}

		return result;

	}
}
