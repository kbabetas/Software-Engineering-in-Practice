package operations;

import org.junit.Assert;
import org.junit.Test;

import filehandlers.FileIO;
import static org.mockito.Mockito.*;

public class ArrayOperationsTest {

	String valid = "src/test/resources/valid.txt";
	String invalid = "src/test/resources/invalid.txt";
	String empty = "src/test/resources/empty.txt";

	@Test
	public void test_findMax_valid() {
		FileIO fio = mock(FileIO.class);
		IntegerOperations io = mock(IntegerOperations.class);
		ArrayOperrations ao = new ArrayOperrations(fio, io);
		when(fio.readFile(valid)).thenReturn(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 });
		Assert.assertEquals(15, ao.findMaxInFile(valid));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_findMaxEmptyFileException() {
		FileIO fio = mock(FileIO.class);
		IntegerOperations io = mock(IntegerOperations.class);
		ArrayOperrations ao = new ArrayOperrations(fio, io);
		when(fio.readFile(empty)).thenReturn(new int[] {});
		ao.findMaxInFile(empty);
	}

}
