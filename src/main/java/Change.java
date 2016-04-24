import java.util.Scanner;

public class Change {
	private static final int FIVE = 5;
	private static final int TEN = 10;

	public static int getChange(int amount) {
		int numberOfTens = amount / TEN;
		int amountWithoutTens = amount - TEN * numberOfTens;
		int numberOfFives = amountWithoutTens / FIVE;
		int numberOfOnes = amountWithoutTens - numberOfFives * FIVE;
		return numberOfTens + numberOfFives + numberOfOnes;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(getChange(n));
	}
}
