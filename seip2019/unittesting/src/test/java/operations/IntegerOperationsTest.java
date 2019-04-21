package operations;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class IntegerOperationsTest {

	IntegerOperations io = new IntegerOperations();

	@Test
	public void test_reverseSign_positive() {
		Assert.assertEquals(-1, io.reverseSign(1));
	}

	@Test
	public void test_reverseSign_negative() {
		Assert.assertEquals(1, io.reverseSign(-1));
	}

	@Test
	public void test_reverseSign_zero() {
		Assert.assertEquals(0, io.reverseSign(0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_add_negatives() {
		io.add(-1, -5);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_add_negative_positive() {
		io.add(-1, 5);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_add_positive_negative() {
		io.add(1, -5);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_add_maxPositive_negative() {
		io.add(Integer.MAX_VALUE, -5);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_add_maxPositives() {
		io.add(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_add_maxPositive_positive() {
		io.add(Integer.MAX_VALUE, 5);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_add_longPositive_positive() {
		io.add(2147483647, 5);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_add_longPositives() {
		io.add(2147483647, 2147483647);
	}

	@Test
	public void test_add_positives() {
		Assert.assertEquals(8, io.add(1, 5));
	}

	@Test
	public void test_add_zeroes() {
		Assert.assertEquals(0, io.add(0, 0));
	}

	@Test
	public void test_add_positive_zero() {
		Assert.assertEquals(1, io.add(1, 0));
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void test_powerOfTwo_negative() {
		thrown.expect(IllegalArgumentException.class);
		io.powerOfTwo(-1);
	}

	@Test
	public void test_powerOfTwo_overflow() {
		thrown.expect(IllegalArgumentException.class);
		io.powerOfTwo(32);
	}

}
