package operations;

import org.junit.Assert;
import org.junit.Test;

import filehandlers.FileIO;
import static org.mockito.Mockito.*;

public class ArrayOperationsTest {

	String valid = "src/test/resources/valid.txt";
	String invalid = "src/test/resources/invalid.txt";
	String empty = "src/test/resources/empty.txt";
	String dif_max = "src/test/resources/dif_max.txt";

	@Test
	public void test_findMax_valid() {
		FileIO fio = mock(FileIO.class);
		IntegerOperations io = mock(IntegerOperations.class);
		ArrayOperrations ao = new ArrayOperrations(fio, io);
		when(fio.readFile(valid)).thenReturn(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 });
		Assert.assertEquals(15, ao.findMaxInFile(valid));
	}
	@Test
	public void test_findMax_difMax() {
		FileIO fio = mock(FileIO.class);
		IntegerOperations io = mock(IntegerOperations.class);
		ArrayOperrations ao = new ArrayOperrations(fio, io);
		when(fio.readFile(dif_max)).thenReturn(new int[] {10, 5, 12, 3, 15});
		Assert.assertEquals(15, ao.findMaxInFile(dif_max));
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_findMax_empty() {
		FileIO fio = mock(FileIO.class);
		IntegerOperations io = mock(IntegerOperations.class);
		ArrayOperrations ao = new ArrayOperrations(fio, io);
		when(fio.readFile(empty)).thenReturn(new int[] {});
		ao.findMaxInFile(empty);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_reverse_empty() {
		FileIO fio = mock(FileIO.class);
		IntegerOperations io = mock(IntegerOperations.class);
		ArrayOperrations ao = new ArrayOperrations(fio, io);
		when(fio.readFile(empty)).thenReturn(new int[] {});
		ao.reverseArray(empty);
	}

	@Test
	public void test_reverseArray_valid() {
		FileIO fio = mock(FileIO.class);
		IntegerOperations io = mock(IntegerOperations.class);
		ArrayOperrations ao = new ArrayOperrations(fio, io);
		when(fio.readFile(valid)).thenReturn(new int[] { 1, 2, 3, 4 });
		when(io.reverseSign(1)).thenReturn(-1);
		when(io.reverseSign(2)).thenReturn(-2);
		when(io.reverseSign(3)).thenReturn(-3);
		when(io.reverseSign(4)).thenReturn(-4);
		ao.reverseArray(valid);
	}

}
