package week1.day1;

public class PrimeNumber {

	static int input = 13, i;

	static boolean flag = false;

	public static void main(String[] args) {

		for (PrimeNumber.i = 2; PrimeNumber.i <= PrimeNumber.input / 2; ++PrimeNumber.i) {
				if (PrimeNumber.input % PrimeNumber.i == 0) {
				PrimeNumber.flag = true;
				break;
			}
		}
		if (!PrimeNumber.flag)
			System.out.println(PrimeNumber.input + " is a Prime Number.");
		else
			System.out.println(input + " is not a Prime Number.");
	}

}
