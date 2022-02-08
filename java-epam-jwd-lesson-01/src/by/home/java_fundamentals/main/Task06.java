package by.home.java_fundamentals.main;

/*Написать программу нахождения суммы большего и меньшего из трех чисел.*/

public class Task06 {
	public static void main(String[] args) {

		double a = 0;
		double b = -5.7;
		double c = -5.9;

		double sum;

		if (a > b && a > c && b < c) {
			sum = a + b;
		} else if (a > b && a > c && c < b) {
			sum = a + c;
		} else if (b > a && b > c && a < c) {
			sum = b + a;
		} else if (b > a && b > c && c < a) {
			sum = b + c;
		} else if (c > a && c > b && a < b) {
			sum = c + a;
		} else if (c > a && c > b && b < a) {
			sum = c + b;
		} else {
			System.out.println("Введены одинаковые числа");
			return;
		}

		System.out.println(sum);
	}

}
