package by.home.java_fundamentals.main;

/*Вычислить значение выражения по формуле (все переменные принимают
действительные значения)*/

public class Task02 {
	public static void main(String[] args) {

	    double a = 8;
	    double b = 2;
	    double c = 3;

	    double exp1;
	    double exp2;
	    double exp3;
	    double exp4;

	    double result;

	    exp1 = Math.pow(b, 2) + 4 * a * c;
	    if (exp1 < 0) {
	      System.out.println("Выражение под корнем отрицательное");
	      return;
	    }

	    exp2 = b + Math.sqrt(exp1) / 2 * a;

	    exp3 = Math.pow(a, 3) * c;

	    exp4 = Math.pow(b, -2);

	    result = exp2 - exp3 + exp4;

	    System.out.println("Результат выражения" + result);
	  }
}
