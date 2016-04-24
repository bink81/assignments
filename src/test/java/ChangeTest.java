import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class ChangeTest {

	@Test
	public void testZero() throws Exception {
		int actual = Change.getChange(0);

		Assert.assertEquals(0, actual);
	}

	@Test
	public void testTwo() throws Exception {
		int actual = Change.getChange(2);

		Assert.assertEquals(2, actual);
	}

	@Test
	public void testBigger() throws Exception {
		int actual = Change.getChange(28);

		Assert.assertEquals(6, actual);
	}

	@Test
	public void testRandomArray() throws Exception {
		List<Integer> randomAmounts = new RandomArrayGenerator(100, 999999999).generateRandomNumbers();
		for (Integer randomAmount : randomAmounts) {
			Change.getChange(randomAmount);
		}
	}
}
