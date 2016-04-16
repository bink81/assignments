import java.util.Scanner;

public class FibonacciLastDigit {
	public static int getFibonacciLastDigit(int n) {
		if (n <= 1) {
			return n;
		}
		int previousLastDigit = 0;
		int lastDigit = 1;
		int tempDigit = 0;
		for (int i = 2; i <= n; i++) {
			tempDigit = lastDigit;
			lastDigit = (lastDigit + previousLastDigit) % 10;
			previousLastDigit = tempDigit;
		}
		return lastDigit;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int c = getFibonacciLastDigit(n);
		System.out.println(c);
	}
}
