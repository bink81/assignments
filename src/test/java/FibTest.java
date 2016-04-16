import org.junit.Test;

import junit.framework.Assert;

public class FibTest {

	@Test
	public void testZero() throws Exception {
		long actual = Fib.calc_fib(0);

		Assert.assertEquals(0, actual);
	}

	@Test
	public void testOne() throws Exception {
		long actual = Fib.calc_fib(1);

		Assert.assertEquals(1, actual);
	}

	@Test
	public void testTwo() throws Exception {
		long actual = Fib.calc_fib(2);

		Assert.assertEquals(1, actual);
	}

	@Test
	public void testThree() throws Exception {
		long actual = Fib.calc_fib(3);

		Assert.assertEquals(2, actual);
	}

	@Test
	public void testTen() throws Exception {
		long actual = Fib.calc_fib(10);

		Assert.assertEquals(55, actual);
	}
}
