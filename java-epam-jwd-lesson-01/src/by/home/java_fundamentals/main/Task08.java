package by.home.java_fundamentals.main;

/*В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
которые кратны данному К.*/

public class Task08 {
	public static void main(String[] args) {

		int[] array = { 10, 5, 28, 369, 3 };

		int k = 3;

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				sum += array[i];
			}
		}

		System.out.println("Сумма элементов кратных " + k + ": " + sum);
	}

}
