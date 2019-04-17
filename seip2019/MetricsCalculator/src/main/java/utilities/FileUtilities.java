package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The purpose of this class is to provide some File Utilities that
 * can be used by other classes without having to write the code from
 * scratch. This class focuses on reading a file and on writing a file.
 *
 * @author Konstantinos Babetas
 */

public final class FileUtilities {

	private FileUtilities() {

	}

	/**
	 * The purpose of this class is to read a file from a specific path and save its
	 * contents in a list.
	 *
	 * @param filepath specifies the path in which the text file is located
	 *
	 * @return list which contains the contents of the file
	 */
	public static List<String> readFile(String filepath) {
		List<String> list = new ArrayList<String>();
		File file = new File(filepath);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String st;
			while ((st = br.readLine()) != null)
				list.add(st);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("File not found");
			return null;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	/**
	 * The purpose of this class is to write on a file provided with a specific path
	 * and specific contents.
	 *
	 * @param filepath specifies the path in which the file is to be written &
	 * content specifies what is to be written in the file
	 *
	 */
	public static void writeFile(String filepath, List<String> content) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(filepath);
			for (String str : content) {
				writer.write(str + ",");
			}
			writer.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
