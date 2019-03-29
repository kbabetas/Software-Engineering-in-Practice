package metricsCalculator;

import java.util.ArrayList;
import java.util.List;

import utilities.FileUtilities;

/**
 * The purpose of this class is to analyze the code of a Java file using the
 * String method
 * 
 * @author Konstantinos Babetas
 */

public class StringCodeAnalyzer extends CodeAnalyzerStrategy {

	/**
	 * The purpose of this method is to find the lines of code (loc), the number of
	 * methods (nom) and the number of classes (noc) that exist in a list with
	 * strings whilst using String Comparison.
	 * 
	 * @param list is a list which contains lines of words
	 * @return contents is a list which contains the 3 metrics that are calculated
	 * @see metricsCalculator.CodeAnalyzerStrategy#calculateMetrics(java.util.List)
	 */

	public List<String> calculateMetrics(List<String> list) {
		List<String> contents = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			line = list.get(i).trim();
			line.trim();
			if ((line.length() > 0) && (!line.startsWith("/")) && (!line.startsWith("*"))) {
				loc = loc + 1;
				if (line.contains("class")) {
					noc = noc + 1;
				} else {
					if ((line.startsWith("public")) || (line.startsWith("private")) || (line.startsWith("protected"))) {
						if (line.endsWith("{")) {
							nom = nom + 1;
						}

					}
				}
			}
		}
		contents.add(String.valueOf(loc));
		contents.add(String.valueOf(noc));
		contents.add(String.valueOf(nom));
		for (int j = 0; j < contents.size(); j++) {
			System.out.println(contents.get(j));
		}
		return contents;

	}
}
