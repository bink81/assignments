import java.util.Scanner;

public class LeastCommonMultiple {
	public static long lcm(int a, int b) {
		if (a == 0 || b == 0) {
			return 0;
		}
		if (a == b) {
			return a;
		}
		long smallerValue = a < b ? a : b;
		long biggerValue = a < b ? b : a;
		for (long i = 1; i < smallerValue * biggerValue; i++) {
			if (i * smallerValue % biggerValue == 0) {
				return i * smallerValue;
			}
		}
		return a * b;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(lcm(a, b));
	}
}
