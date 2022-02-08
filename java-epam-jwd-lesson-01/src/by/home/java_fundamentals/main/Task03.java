package by.home.java_fundamentals.main;

/*Вычислить периметр и площадь прямоугольного треугольника по длинам а и b
двух катетов*/

public class Task03 {
	public static void main(String[] args) {

		double a = 5.0;
		double b = 6.3;

		double perimetr;
		perimetr = perimetrOfRightTriangle(a, b);
		System.out.println("Периметр прямоугольного треугольника равен " + perimetr);

		double square;
		square = squareOfRightTriangle(a, b);
		System.out.println("Площадь прямоугольного треугольника равна " + square);

	}

	// Метод, который высчитывает периметр прямоугольного треугольника по двум
	// катетам
	public static double perimetrOfRightTriangle(double a, double b) {

		double perimetr;

		perimetr = a + b + hypotenuse(a, b);

		return perimetr;
	}

	// Метод, который высчитывает площадь прямоугольного треугольника по двум
	// катетам
	public static double squareOfRightTriangle(double a, double b) {

		double square;

		square = a * b / 2;

		return square;
	}

	// Метод, который высчитывает гипотенузу прямоугольного треугольника по двум
	// катетам
	public static double hypotenuse(double a, double b) {

		double hypotenuse;

		hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

		return hypotenuse;
	}
}
