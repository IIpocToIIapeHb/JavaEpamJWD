package by.home.java_fundamentals.Task03;

/*Заданы два одномерных массива с различным количеством элементов и
натуральное число k. Объединить их в один массив, включив второй массив
между k-м и (k+1) - м элементами первого.*/

public class ArraysMergerController {

	public static void main(String[] args) {

		ArraysMergerView view = new ArraysMergerView();

		view.showMessage("Задайте первый массив");

		ArraysMergerInput input = new ArraysMergerInput();

		double[] array1 = input.createArray(5);

		view.showArray(array1);

		view.showMessage("Задайте второй массив");
		double[] array2 = input.createArray(6);
		view.showArray(array1);

		ArraysMergerLogic logic = new ArraysMergerLogic();

		double[] resultArray = logic.arraysMerger(5, array1, array2);

		view.showArray(resultArray);
	}

}
