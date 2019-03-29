package metricsCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The purpose of this class is to analyse the code of a Java file using Regular
 * Expressions
 * 
 * @author Konstantinos Babetas
 */

public class RegExCodeAnalyzer extends CodeAnalyzerStrategy {

	/**
	 * The purpose of this method is to find the lines of code (loc), the number of
	 * methods (nom) and the number of classes (noc) that exist in a list with
	 * strings.
	 * 
	 * @param list is a list which contains lines of words
	 * @return contents is a list which contains the 3 metrics that are calculated
	 * @see metricsCalculator.CodeAnalyzerStrategy#calculateMetrics(java.util.List)
	 */
	public List<String> calculateMetrics(List<String> list) {
		List<String> contents = new ArrayList<String>();
		String classeRreg = "\\bclass\\b";
		String methodStartReg = "^public|^protected|^private";
		String methodEndReg = "\\{$";
		String lineStartReg = "^\\*|^/|^\\s+";
		String linesToOmmitReg = "^(?!($))^(?!(\\*))^(?!(/))";
		Pattern p1 = Pattern.compile(classeRreg);
		Matcher m1 = null;
		Pattern p2 = Pattern.compile(methodStartReg);
		Matcher m2 = null;
		Pattern p3 = Pattern.compile(methodEndReg);
		Matcher m3 = null;
		Pattern p4 = Pattern.compile(lineStartReg);
		Matcher m4 = null;
		Pattern p5 = Pattern.compile(linesToOmmitReg);
		Matcher m5 = null;
		for (int i = 0; i < list.size(); i++) {
			line = list.get(i).trim();
			m1 = p1.matcher(line);
			m4 = p4.matcher(line);
			while (m1.find()) {
				if (!m4.find()) {
					noc++;
				}
			}
			m2 = p2.matcher(line);
			m3 = p3.matcher(line);
			m1 = p1.matcher(line);
			while (m2.find()) {
				if (m3.find() && (!m1.find())) {
					nom++;
				}
			}
			m5 = p5.matcher(line);
			while (m5.find()) {
				loc++;
			}
		}
		contents.add(String.valueOf(loc));
		contents.add(String.valueOf(noc));
		contents.add(String.valueOf(nom));

		return contents;
	}
}
