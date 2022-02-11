package by.home.java_fundamentals.Task01;

public class FourDigitNumberView {

	public void showMessage(String message) {
		System.out.println(message);
	}

	public void showIsSumOfTwoFirstAndTwoLastDigitsEquels(boolean result) {
		if (result) {
			System.out.println("true - Сумма первых двух цифр числа Равна сумме двух его последних цифр");
		} else {
			System.out.println("false - Сумма первых двух цифр числа НЕ Равна сумме двух его последних цифр");
		}

	}
}
