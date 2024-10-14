/**
 * Represents a legislative bill proposed in the assembly.
 * Contains details such as title, description, and current status of the bill.
 */
public class Bill {
    private String title;
    private String description;
    private String status;

    /**
     * Constructor to initialize a bill with title and description.
     * Sets the default status of the bill to "proposed".
     * @param title Title of the bill.
     * @param description Description of the bill.
     */
    public Bill(String title, String description) {
        this.title = title;
        this.description = description;
        this.status = "proposed";
    }

    /**
     * Updates the status of the bill.
     * @param status New status of the bill.
     */
    public void updateStatus(String status) {
        this.status = status;
    }

    /**
     * Returns the details of the bill.
     * @return String containing the title, description, and status of the bill.
     */
    public String getDetails() {
        return "Title: " + title + ", Description: " + description + ", Status: " + status;
    }

    /**
     * Gets the title of the bill.
     * @return Title of the bill.
     */
    public String getTitle() {
        return title;
    }
}
