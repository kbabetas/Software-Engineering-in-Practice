package metricsCalculator;

import java.util.List;

/**
 * The purpose of this class is to serve as Demo Main class in the
 * MetricsCalculator function
 * 
 * @author kbabetas
 *
 */

public class DemoMetricsMain {

	public static void main(String[] args) {
		String filepath = args[0];
		String type = args[1];
		List<String> list = Facade.readFile(filepath);
		List<String> results = Facade.calculateMetrics(type, list);
		Facade.writeCSV("results.csv", results);

	}

}
