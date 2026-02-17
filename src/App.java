import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // TODO: Update this with your CSV file path
        File file = new File("data/your_dataset.csv");

        // TODO: Create an array of Data objects to store data
        Data[] dataList = new Data[1000]; // assuming max 1000 rows
        int count = 0;

        // TODO: Read file using Scanner
        // - Skip header if needed
        // - Loop through rows
        // - Split each line by commas
        // - Convert text to numbers when needed
        // - Create new Data objects
        // - Add to your array
        try {
            Scanner scanner = new Scanner(file);
            if (scanner.hasNextLine()) {
                scanner.nextLine(); // skip header
            }
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                
                // example assuming CSV has: name, value1, value2
                String name = parts[0];
                double value1 = Double.parseDouble(parts[1]);
                double value2 = Double.parseDouble(parts[2]);

                Data d = new Data(name, value1, value2);
                dataList[count] = d;
                count++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found: " + file.getPath());
        }

        // TODO: Call your analysis methods
        // Example:
        double maxValue = findMaxValue(dataList, count);
        double average = computeAverageValue(dataList, count);

        // TODO: Print insights
        // - Number of rows loaded
        // - Min, max, average, or any other findings
        // - Final answer to your guiding question
        System.out.println("rows loaded: " + count);
        System.out.println("max value: " + maxValue);
        System.out.println("average value: " + average);

    }

    // simple method to find max of value1 in the array
    public static double findMaxValue(Data[] list, int size) {
        double max = list[0].value1;
        for (int i = 1; i < size; i++) {
            if (list[i].value1 > max) {
                max = list[i].value1;
            }
        }
        return max;
    }

    // simple method to compute average of value1 in the array
    public static double computeAverageValue(Data[] list, int size) {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += list[i].value1;
        }
        return sum / size;
    }
}

// simple Data class
class Data {
    String name;
    double value1;
    double value2;

    public Data(String name, double value1, double value2) {
        this.name = name;
        this.value1 = value1;
        this.value2 = value2;
    }
}
