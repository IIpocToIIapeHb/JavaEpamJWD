package by.home.java_fundamentals.main;

import java.util.Arrays;

/*Заданы два одномерных массива с различным количеством элементов и
натуральное число k. Объединить их в один массив, включив второй массив
между k-м и (k+1) - м элементами первого.*/

public class Task09 {
	public static void main(String[] args) {

		int[] array1 = { 1, 45, 7, 58 };
		int[] array2 = { 0, 158, 1 };

		int k = 2;

		int[] result = new int[array1.length + array2.length];

		//вставляем в новый массив элементы из 1-го массива до к
		for (int i = 0; i < k; i++) {
			result[i] = array1[i];
		}
		;
		//вставляем в новый массив элементы из 1-го, которые должны стоять после элементов из 2-го массива
		for (int i = result.length - 1; i >= k + array2.length; i--) {
			result[i] = array1[i - array2.length];
		}
		;
		// вставляем в новыймассив элементы из 2-го массива
		System.arraycopy(array2, 0, result, k, array2.length);

		System.out.println(Arrays.toString(result));

	}

}
