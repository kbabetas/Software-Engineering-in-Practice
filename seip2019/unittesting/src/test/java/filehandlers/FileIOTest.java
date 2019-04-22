package filehandlers;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FileIOTest {

	FileIO fio = new FileIO();
	String valid = "src/test/resources/valid.txt";
	String invalid ="src/test/resources/invalid.txt";
	String empty ="src/test/resources/empty.txt";
	String letters ="src/test/resources/letters.txt";
	int [] output = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
	int [] emptyOutput = {};
	
	@Test
	public void test_readFile_valid() {
		Assert.assertArrayEquals(output, fio.readFile(valid));
	}
	
	@Test
	public void test_readFile_empty() {
		Assert.assertArrayEquals(emptyOutput, fio.readFile(empty));
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
	
	@Test(expected = NumberFormatException.class)
	public void test_readFile_letters() {
		fio.readFile(letters);
	}
	
}
