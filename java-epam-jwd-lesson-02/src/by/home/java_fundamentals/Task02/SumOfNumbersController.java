package by.home.java_fundamentals.Task02;

/*Написать программу нахождения суммы большего и меньшего из трех чисел.*/

public class SumOfNumbersController {

	public static void main(String[] args) {

		SumOfNumbersView view = new SumOfNumbersView();

		view.showMessage("Введите значение 1-го числа");

		SumOfNumbersInput input = new SumOfNumbersInput();

		double number1 = input.readNumber();

		view.showMessage("Введите значение 2-го числа");
		double number2 = input.readNumber();

		view.showMessage("Введите значение 3-го числа");
		double number3 = input.readNumber();

		SumOfNumbersLogic logic = new SumOfNumbersLogic();

		double sum = logic.sumOfBiggestAndSmallestNumbersOutOfThree(number1, number2, number3);

		view.showResult(sum);

	}
}