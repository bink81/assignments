import org.junit.Test;

import junit.framework.Assert;

public class GreatesCommonDivisorTest {
	@Test
	public void testSmallNumbers() throws Exception {
		long actual = GreatesCommonDivisor.gcd(18, 35);

		Assert.assertEquals(1, actual);
	}

	@Test
	public void testBigNumbers() throws Exception {
		long actual = GreatesCommonDivisor.gcd(28851538, 1183019);

		Assert.assertEquals(17657, actual);
	}
}
