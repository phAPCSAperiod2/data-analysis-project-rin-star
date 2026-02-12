/**
 * Represents one row from your dataset.
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
    private int id;
    private double value1;
    private double value2;

    // TODO: Create a constructor that takes all attributes as parameters
    public Data(int id, double value1, double value2) {
        this.id = id;
        this.value1 = value1;
        this.value2 = value2;
    }

    // TODO: Add getters for attributes you need
    public int getId() {
        return id;
    }

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    // TODO: Add other data analysis methods
    // (no additional methods needed for basic analysis in App class)

    // TODO: Override toString() to return a readable representation of your object
    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
