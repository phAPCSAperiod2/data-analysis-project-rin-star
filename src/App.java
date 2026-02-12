import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main application for the Data Analysis Mini‑Project.
 *
 * TODO:
 *  - Update the path to your dataset file
 *  - Read the CSV file using Scanner
 *  - Parse each row and extract the correct columns
 *  - Construct Data objects from each row
 *  - Store them in an array
 *  - Write methods to analyze the dataset (min, max, average, filters, etc.)
 *  - Print insights and answer your guiding question
 *  - Add Javadoc comments for any methods you create
 */
public class App {

    static class Data {
        int id;
        double value1;
        double value2;

        Data(int id, double value1, double value2) {
            this.id = id;
            this.value1 = value1;
            this.value2 = value2;
        }
    }

    public static void main(String[] args) {

        // TODO: Update this with your CSV file path
        File file = new File("data/your_dataset.csv");

        // TODO: Create an array of Data objects to store data
        ArrayList<Data> dataList = new ArrayList<>();

        // TODO: Read file using Scanner
        try (Scanner scanner = new Scanner(file)) {

            // - Skip header if needed
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            // - Loop through rows
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // - Split each line by commas
                String[] parts = line.split(",");

                // - Convert text to numbers when needed
                int id = Integer.parseInt(parts[0]);
                double value1 = Double.parseDouble(parts[1]);
                double value2 = Double.parseDouble(parts[2]);

                // - Create new Data objects
                Data data = new Data(id, value1, value2);

                // - Add to your array
                dataList.add(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getAbsolutePath());
            return;
        }

        // TODO: Call your analysis methods
        double maxValue1 = findMaxValue1(dataList);
        double minValue1 = findMinValue1(dataList);
        double averageValue1 = computeAverageValue1(dataList);

        // TODO: Print insights
        System.out.println("numbers of rows loaded: " + dataList.size());
        System.out.println("Value1 - Min: " + minValue1);
        System.out.println("Value1 - Max: " + maxValue1);
        System.out.println("Value1 - Average: " + averageValue1);
        System.out.println("Analysis complete!");
    }

    public static double findMaxValue1(ArrayList<Data> dataList) {
        double max = Double.NEGATIVE_INFINITY;
        for (Data data : dataList) {
            if (data.value1 > max) {
                max = data.value1;
            }
        }
        return max;
    }

    public static double findMinValue1(ArrayList<Data> dataList) {
        double min = Double.POSITIVE_INFINITY;
        for (Data data : dataList) {
            if (data.value1 < min) {
                min = data.value1;
            }
        }
        return min;
    }

    public static double computeAverageValue1(ArrayList<Data> dataList) {
        double sum = 0;
        for (Data data : dataList) {
            sum += data.value1;
        }
        return sum / dataList.size();
    }
}
