import org.junit.Test;

import junit.framework.Assert;

public class FibonacciLastDigitTest {

	@Test
	public void testThree() throws Exception {
		long actual = FibonacciLastDigit.getFibonacciLastDigit(3);

		Assert.assertEquals(2, actual);
	}

	@Test
	public void testBigNumber() throws Exception {
		long actual = FibonacciLastDigit.getFibonacciLastDigit(327305);

		Assert.assertEquals(5, actual);
	}
}
