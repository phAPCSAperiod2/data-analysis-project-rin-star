/**
 * represents one row from your dataset.
 *
 * TODO:
 *  - Rename the class to match your dataset (e.g., Pokemon, StateData, CountryStat)
 *  - Add at least 3 private attributes based on your CSV columns
 *  - Write a constructor that initializes all attributes
 *  - Add getter methods for the attributes you need in your analysis
 *  - Override toString() to display the object's data
 *  - Add Javadoc comments for the class and all methods
 */
public class Data {

    // TODO: Add at least 3 private attributes
    private String name;
    private double value1;
    private double value2;

    // TODO: Create a constructor that takes all attributes as parameters
    public Data(String name, double value1, double value2) {
        this.name = name;
        this.value1 = value1;
        this.value2 = value2;
    }

    // TODO: Add getters for attributes you need
    public String getName() {
        return name;
    }

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    // TODO: Add other data analysis methods
    // example: simple method to check if value1 is greater than a threshold
    public boolean isValue1GreaterThan(double threshold) {
        return value1 > threshold;
    }

    // TODO: Override toString() to return a readable representation of your object
    @Override
    public String toString() {
        return "name: " + name + ", value1: " + value1 + ", value2: " + value2;
    }
}
