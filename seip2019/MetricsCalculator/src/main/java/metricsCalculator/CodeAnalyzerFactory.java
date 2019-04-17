package metricsCalculator;

/**
 * The purpose of this class is to play the role of the Factory in the design
 * patter "Factory" and create an object of a Strategy.
 *
 * @author Konstantinos Babetas
 */

public class CodeAnalyzerFactory {

	/**
	 * The purpose of this method is to create the correct Code Analyzer
	 *
	 * @param type is the type of Code Analyzer that will be created
	 * @return strategy is the Code Analyzer
	 */

	public static CodeAnalyzerStrategy getCodeAnalyzerStrategy(String type) {
		CodeAnalyzerStrategy strategy = null;

		if (type.contentEquals("String")) {
			strategy = new StringCodeAnalyzer();

		} else {
			strategy = new RegExCodeAnalyzer();
		}
		return strategy;
	}
}
