package gradeshistogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * The purpose of this class is to generate a Histogram based on a text file
 * with integer grades.
 * 
 * @author Konstantinos Babetas
 */

public class HistogramGenerator {

	/**
	 * The purpose of this method is to read the int grades from a text file and put
	 * them in a list.
	 * 
	 * @param path specifies the path in which the text file is located
	 * @return list which is the list of the grades
	 */

	public static List<Integer> readGrades(String path) {
		List<Integer> list = new ArrayList<Integer>();
		File file = new File(path);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String st;
			while ((st = br.readLine()) != null)
				list.add(Integer.parseInt(st));
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
	 * The purpose of this method is to create a frequencies' array given a list of
	 * integers and calculate how often they appear.
	 * 
	 * @param grades is a list of integers
	 * @return freq which is an integers'array with the frequencies of appearances
	 *         of each integer
	 */
	public static int[] createFrequencies(List<Integer> grades) {
		int[] freq = new int[11];
		for (int i = 0; i < freq.length; i++) {
			freq[i] = 0;
		}
		for (int i = 0; i < grades.size(); i++) {
			freq[grades.get(i)]++;
		}
		return freq;
	}

	/**
	 * The purpose of this method is to generate a Histogram chart based on
	 * frequency values of the integers,
	 * 
	 * @param freq is an array with the frequency every integer has appeared
	 */

	public void developHistogram(int[] freq) {
		XYSeriesCollection dataset = new XYSeriesCollection();
		XYSeries data = new XYSeries("frequencies");
		for (int i = 0; i < freq.length; i++) {
			data.add(i, freq[i]);
		}
		dataset.addSeries(data);
		boolean legend = false;
		boolean tooltips = false;
		boolean urls = false;
		JFreeChart chart = ChartFactory.createXYLineChart("Grades Histogram", "Grades", "Frequencies", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);
		ChartFrame frame = new ChartFrame("Histogram", chart);
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * The purpose of the main method is to get through the command line arguments
	 * the path where the text file is located and using that to call the method to
	 * read the grades and to create the frequencies. Then, the method is calling
	 * generateChart in order to develop the histogram.
	 * 
	 * @param args is the command line argument that specifies the path in which the
	 *             text file is located
	 */

	public static void main(String[] args) {
		List grades = new ArrayList<Integer>();
		String path = args[0];
		grades = readGrades(path);
		int[] freq = createFrequencies(grades);
		HistogramGenerator hist = new HistogramGenerator();
		hist.developHistogram(freq);
	}

}
