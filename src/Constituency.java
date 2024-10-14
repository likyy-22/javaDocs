/**
 * Represents a constituency in the legislative assembly.
 * Contains details about the constituency name and population.
 */
public class Constituency {
    private String name;
    private int population;

    /**
     * Constructor to initialize a constituency with its name and population.
     * @param name Name of the constituency.
     * @param population Population of the constituency.
     */
    public Constituency(String name, int population) {
        this.name = name;
        this.population = population;
    }

    /**
     * Returns the details of the constituency.
     * @return String containing the name and population of the constituency.
     */
    public String getDetails() {
        return "Constituency: " + name + ", Population: " + population;
    }
}
