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
    // Example:
    // private String name;
    // private int population;
    // private double value;

    private String pokemon;
    private String type1;
    private String type2;
    private int attack;

    // TODO: Create a constructor that takes all attributes as parameters
    public Data(String pokemon, String type1, String type2, int attack) {
        this.pokemon = pokemon;
        this.type1 = type1;
        this.type2 = type2;
        this.attack = attack;
    }

    // TODO: Add getters for attributes you need
    public String getPokemon() {
        return pokemon;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public int getAttack() {
        return attack;
    }

    // TODO: Add other data analysis methods
    public boolean hasTwoTypes() {
        if (!type2.equals("")) {
            return true;
        }
        return false;
    }

    public boolean hasType(String type) {
        if (type1.equalsIgnoreCase(type)) {
            return true;
        }
        if (type2.equalsIgnoreCase(type)) {
            return true;
        }
        return false;
    }

    // TODO: Override toString() to return a readable representation of your object
    public String toString() {
        if (!type2.equals("")) {
            return pokemon + " | " + type1 + "/" + type2 + " | attack: " + attack;
        }
        return pokemon + " | " + type1 + " | attack: " + attack;
    }

}
