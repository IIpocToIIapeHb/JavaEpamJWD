package by.home.java_fundamentals.main;

import java.util.Scanner;

/*Составить линейную программу, печатающую значение true,
 *если указанное высказывание является истинным, и false — в противном случае:

Сумма двух первых цифр заданного четырехзначного числа
равна сумме двух его последних цифр.*/

public class Task01 {
	public static void main(String[] args) {
		int n = fourDigitInt();
		expressionCheck(n);

	}
	
	
    // Создаем любое четырехзначное число

	public static int fourDigitInt() {

		System.out.println("Введите четырехзначное целое число");

		Scanner sc1 = new Scanner(System.in);

		while (!sc1.hasNextInt()) {
			sc1.next();
			System.out.println("Введите целое число");
		}

		int i = sc1.nextInt();

		if (i / 1000 > 0 && i / 1000 < 10) {
			return i;
		} else {
			System.out.println("Данное число не 4-хзначное. Попробуйте ещё раз.");
			return i = fourDigitInt();

		}

	}

	// Проверяем является ли сумма двух первых цифр заданного четырехзначного числа
	//равна сумме двух его последних цифр
	
	public static void expressionCheck(int n) {

		int sum1 = n / 1000 + n / 100 % 10;
		int sum2 = n % 100 / 10 + n % 10;

		if (sum1 == sum2) {
			System.out.println("Сумма первых двух цифр числа " + n + " РАВНА сумме двух его последних цифр");
		} else {
			System.out.println(
					"Поздравляем. Сумма первых двух цифр числа " + n + " 45НЕ РАВНА сумме двух его последних цифр");
		}

	}

}
