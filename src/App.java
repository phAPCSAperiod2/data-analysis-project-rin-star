import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Main application for the Data Analysis Mini-Project.
 *
 * TODO:
 *  - Update the path to your dataset file\
 *  - Read the CSV file using Scanner
 *  - Parse each row and extract the correct columns
 *  - Construct Data objects from each row
 *  - Store them in an array
 *  - Write methods to analyze the dataset (min, max, average, filters, etc.)
 *  - Print insights and answer your guiding question
 *  - Add Javadoc comments for any methods you create
 */
public class App {

    public static void main(String[] args) {

        // TODO: Update this with your CSV file path
        File file = new File("data/pokemon (1).csv");

        // TODO: Create an array of Data objects to store data
        Data[] dataList = new Data[151];
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
                scanner.nextLine();
            }

            while (scanner.hasNextLine() && count < dataList.length) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                String name = parts[1];
                String type1 = parts[2];
                String type2 = parts[3];
                int attack = Integer.parseInt(parts[5]);

                dataList[count] = new Data(name, type1, type2, attack);
                count++;
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        }

        // TODO: Call your analysis methods
        // Example:
        // double maxValue = findMaxValue(dataList);
        // double average = computeAverageValue(dataList);
        int maxAttack = findMaxAttack(dataList, count);
        int twoTypeCount = countTwoTypes(dataList, count);

        // TODO: Print insights
        // - Number of rows loaded
        // - Min, max, average, or any other findings
        // - Final answer to your guiding question
        System.out.println("number of rows loaded: " + count);
        System.out.println("max attack: " + maxAttack);
        System.out.println("number of pokemon with two types: " + twoTypeCount);


        // OPTIONAL TODO:
        // Add user interaction:
        // Ask the user what kind of analysis they want to see
    }

    public static int findMaxAttack(Data[] dataList, int size) {
        int max = dataList[0].getAttack();

        for (int i = 1; i < size; i++) {
            if (dataList[i].getAttack() > max) {
                max = dataList[i].getAttack();
            }
        }

        return max;
    }

    public static int countTwoTypes(Data[] dataList, int size) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (dataList[i].hasTwoTypes()) {
                count++;
            }
        }

        return count;
    }

}
