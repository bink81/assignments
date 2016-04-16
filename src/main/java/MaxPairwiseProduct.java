import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxPairwiseProduct {
	static long getMaxPairwiseProduct(int[] numbers) {
		if (numbers.length == 1) {
			return 0;
		}
		Integer maxIndex1 = null;
		Integer maxIndex2 = null;
		for (int i = 0; i < numbers.length; ++i) {
			if (maxIndex1 == null || numbers[i] > numbers[maxIndex1]) {
				maxIndex2 = maxIndex1;
				maxIndex1 = i;
			} else if (maxIndex2 == null || numbers[i] > numbers[maxIndex2]) {
				maxIndex2 = i;
			}
		}
		long result = ((long) (numbers[maxIndex1])) * numbers[maxIndex2];
		return result;
	}

	public static void main(String[] args) {
		FastScanner scanner = new FastScanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println(getMaxPairwiseProduct(numbers));
	}

	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(InputStream stream) {
			try {
				br = new BufferedReader(new InputStreamReader(stream));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}
}