package by.home.java_fundamentals.main;

/*Даны три действительных числа. Возвести в квадрат те из них, значения
которых неотрицательны, и в четвертую степень — отрицательные.*/

public class Task05 {
	public static void main(String[] args) {

		double a = 0.0;
		double b = 5.0;
		double c = -8.9;

		specialMethod(a);
		specialMethod(b);
		specialMethod(c);

	}

	public static void specialMethod(double x) {

		double result;

		if (x >= 0) {
			result = Math.pow(x, 2);
			System.out.println("Число  " + x + " неотрицательное. Возведем в квадрат: " + result);
		} else {
			result = Math.pow(x, 4);
			System.out.println("Число  " + x + " отрицательное. Возведем в четвертую степень: " + result);

		}

	}
}
