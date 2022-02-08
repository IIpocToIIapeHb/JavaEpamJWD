package by.home.java_fundamentals.main;

import java.util.Arrays;

/*Составить программу вычисления значений функции F(x) на отрезке [а, b] с
шагом h. Результат представить в виде таблицы, первый столбец которой –
значения аргумента, второй - соответствующие значения функции:*/

public class Task07 {
	public static void main(String[] args) {

		double a = -10;
		double b = 10;
		double h = 0.2;

		double fx;

		System.out.println(" -----------------------");
		System.out.println("|     x     |     fx    |");

		for (double i = a; i <= b; i += h) {

			fx = Math.pow(Math.sin(i), 2) - Math.cos(2 * i);

			System.out.println(" -----------------------");
			System.out.printf("|%-11.2f|%-11.2f|\n", i, fx);
		}

		System.out.println(" -----------------------");

	}
}
