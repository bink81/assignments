import org.junit.Test;

import junit.framework.Assert;

public class LeastCommonMultipleTest {
	@Test
	public void testSmallNumbers() throws Exception {
		long actual = LeastCommonMultiple.lcm(6, 8);

		Assert.assertEquals(24, actual);
	}

	@Test
	public void testEqualNumbers() throws Exception {
		long actual = LeastCommonMultiple.lcm(10, 10);

		Assert.assertEquals(10, actual);
	}

	@Test
	public void testBigNumbers() throws Exception {
		long actual = LeastCommonMultiple.lcm(28851538, 1183019);

		Assert.assertEquals(1933053046, actual);
	}
}
