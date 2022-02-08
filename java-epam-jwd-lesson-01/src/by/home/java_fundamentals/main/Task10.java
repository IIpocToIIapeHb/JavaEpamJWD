package by.home.java_fundamentals.main;

import java.util.Arrays;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n -
четное):*/

public class Task10 {
	public static void main(String[] args) {

		int n = 20;

		int[][] array = new int[n][n];

		for (int i = 0; i < array.length; i++) {

			if (i % 2 == 0) { // условие, если строка четная

				int temp = 1;
				for (int j = 0; j < array[0].length; j++) {
					array[i][j] = temp;
					temp += 1;
				}

			} else { // условие, если строка нечетная

				int temp = array.length;
				for (int j = 0; j < array[0].length; j++) {
					array[i][j] = temp;
					temp -= 1;
				}
			}
		}

		for (int k = 0; k < array.length; k++) {
			System.out.println(Arrays.toString(array[k]));
		}

	}
}
