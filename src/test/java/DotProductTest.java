import org.junit.Assert;
import org.junit.Test;

public class DotProductTest {

	@Test
	public void testZeros() throws Exception {
		int[] a = new int[] {};
		int[] b = new int[] {};
		long actual = DotProduct.minDotProduct(a, b);

		Assert.assertEquals(0, actual);
	}

	@Test
	public void testOneSolution() throws Exception {
		int[] a = new int[] { 23 };
		int[] b = new int[] { 39 };
		long actual = DotProduct.minDotProduct(a, b);

		Assert.assertEquals(897, actual);
	}

	@Test
	public void testWithPermutations() throws Exception {
		int[] a = new int[] { 1, 3, -5 };
		int[] b = new int[] { -2, 4, 1 };
		long actual = DotProduct.minDotProduct(a, b);

		Assert.assertEquals(-25, actual);
	}
}
