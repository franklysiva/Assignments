package week1.day1;

public class Factorial {
	static int input = 5, fact = 1, i;

	public static void main(String[] args) {
		for (Factorial.i = 1; Factorial.i <= Factorial.input; Factorial.i++) {
			Factorial.fact = Factorial.fact * Factorial.i;
		}
		System.out.println(input + "! equals to " + Factorial.fact);
	}

}
