package metricsCalculator;

import java.util.ArrayList;
import java.util.List;

import utilities.FileUtilities;

/**
 * The purpose of this class is to serve as a Facade that provides functions for
 * the main operations in the design pattern "Facade".
 * 
 * @author Konstantinos Babetas
 *
 */

public class Facade {

	/**
	 * The purpose of this method is to read a file from a certain path and put its
	 * contents in a list.
	 * 
	 * @param filepath is the location of the file
	 * @return list contains the contents of the file
	 */

	public static List<String> readFile(String filepath) {
		List<String> list = new ArrayList<String>();
		list = FileUtilities.readFile(filepath);
		return list;
	}

	/**
	 * The purpose of this method is to write a CSV in a certain path and put the
	 * contents of a list inside it.
	 * 
	 * @param filepath is the location of the CSV to be created
	 * @param content  is what is going to be written in the CSV
	 */

	public static void writeCSV(String filepath, List<String> content) {
		FileUtilities.writeFile(filepath, content);
	}

	/**
	 * The purpose of this method is to calculate the metrics according to the type
	 * of analyzer that is to be created and given a specific list of lines.
	 * 
	 * @param type is the indicator about whether to create a String or RegEx Code
	 *             Analyzer
	 * @param list contains the contents of the file
	 * @return results contain the metrics that are calculated
	 */

	public static List<String> calculateMetrics(String type, List<String> list) {
		List<String> results = null;
		CodeAnalyzerStrategy strategy = Factory.getCodeAnalyzerStrategy(type);
		results = strategy.calculateMetrics(list);
		return results;
	}
}
