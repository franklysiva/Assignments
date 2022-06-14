package week1.day1;

public class FibonacciSeries {

	static int firstNum = 0, secNum = 1, range = 8, i, sum;

	public static void main(String[] args) {

		System.out.print(FibonacciSeries.firstNum + " " + FibonacciSeries.secNum);

		for (FibonacciSeries.i = 2; FibonacciSeries.i < FibonacciSeries.range; ++i) {
			FibonacciSeries.sum = FibonacciSeries.firstNum + FibonacciSeries.secNum;
			FibonacciSeries.firstNum = FibonacciSeries.secNum;
			FibonacciSeries.secNum = FibonacciSeries.sum;
			System.out.print(" " + FibonacciSeries.sum);
		}
	}
}
