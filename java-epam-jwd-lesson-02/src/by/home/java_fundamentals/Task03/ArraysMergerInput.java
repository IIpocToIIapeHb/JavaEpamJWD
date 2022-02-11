package by.home.java_fundamentals.Task03;

import java.util.Scanner;

/*Заданы два одномерных массива с различным количеством элементов и
натуральное число k. Объединить их в один массив, включив второй массив
между k-м и (k+1) - м элементами первого.*/

public class ArraysMergerInput {

	public double[] createArray(int size) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		double[] array = new double[size];

		for (int i = 1; i <= size; i++) {
			System.out.println("Введите " + i + " -й элемент");
			while (!scanner.hasNextDouble()) {
				scanner.next();
				System.out.println("Вы ввели не действительное число");
			}
			array[i - 1] = scanner.nextDouble();
		}

		return array;

	}
}
