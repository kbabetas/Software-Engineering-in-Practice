package operations;

import org.junit.Assert;
import org.junit.Test;



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

}
