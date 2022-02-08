package by.home.java_fundamentals.main;

/*Для данных областей составить линейную программу, которая печатает true,
если точка с координатами (х, у) принадлежит закрашенной области, и false — в
противном случае:*/

public class Task04 {
	public static void main(String[] args) {

		double x = 0;
		double y = -1.0;

		if (x >= - 4 && x <= 4 && y <= 0 && y >= -3) {
			System.out.println(true + " Точка принадлежит закрашенной области");
		} else {
			if (x >= -2 && x <= 2 && y <= 4 && y >= 0) {
				System.out.println(true + " Точка принадлежит закрашенной области");
			} else {
				System.out.println(false + " Точка не принадлежит закрашенной области");
			}
		}
	}

}
