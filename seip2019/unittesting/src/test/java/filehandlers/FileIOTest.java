package filehandlers;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FileIOTest {

	FileIO fio = new FileIO();
	String valid = "src/test/resources/valid.txt";
	String invalid ="src/test/resources/invalid.txt";
	int [] output = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
	
	@Test
	public void test_readFile_valid() {
		Assert.assertArrayEquals(output, fio.readFile(valid));
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	@Test
	public void test_readFile_fileNotFound() {
		thrown.expect(IllegalArgumentException.class);
		fio.readFile("nonexistent_file");
	}
	
	@Test(expected = NumberFormatException.class)
	public void test_readFile_invalid() {
		fio.readFile(invalid);
	}
}
