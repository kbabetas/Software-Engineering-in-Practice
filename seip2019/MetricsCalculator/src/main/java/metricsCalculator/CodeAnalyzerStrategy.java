package metricsCalculator;

import java.util.List;

/**
 * The purpose of this class is to create a Strategy Design Pattern when
 * choosing whether to create a String or a RegEx Code Analyzer.
 * 
 * @author Konstantinos Babetas
 *
 */

public abstract class CodeAnalyzerStrategy {
	static int loc = 0;
	static int nom = 0;
	static int noc = 0;
	static String line = null;

	/**
	 * The purpose of this method is to calculate the metrics from a given list.
	 * 
	 * @param list contains the lines of the file from which the metrics will be
	 *             calculated
	 * @return contents contains the metrics that are calculated
	 */

	public List<String> calculateMetrics(List<String> list) {
		List<String> contents = null;

		return contents;

	}
}
