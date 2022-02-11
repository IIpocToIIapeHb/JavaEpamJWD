package by.home.java_fundamentals.Task02;

import java.util.Scanner;

public class SumOfNumbersInput {

	public double readNumber() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.println("Вы ввели не действительное число");
		}

		return scanner.nextDouble();

	}

}
