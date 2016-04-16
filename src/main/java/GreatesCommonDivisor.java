import java.util.Scanner;

public class GreatesCommonDivisor {
	public static int gcd(int a, int b) {
		return recursiveGcd(a, b, 1);
	}

	private static int recursiveGcd(int a, int b, int currentGcd) {
		for (int d = 2; d <= a && d <= b; ++d) {
			if (a % d == 0 && b % d == 0) {
				return recursiveGcd(a / d, b / d, currentGcd * d);
			}
		}
		return currentGcd;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(gcd(a, b));
	}
}
