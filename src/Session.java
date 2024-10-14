import java.util.ArrayList;
import java.util.List;

/**
 * Represents a session in the legislative assembly.
 * Contains details such as date, agenda, and attendees of the session.
 */
public class Session {
    private String date;
    private String agenda;
    private List<Member> attendees;

    /**
     * Constructor to initialize a session with date and agenda.
     * @param date Date of the session.
     * @param agenda Agenda of the session.
     */
    public Session(String date, String agenda) {
        this.date = date;
        this.agenda = agenda;
        this.attendees = new ArrayList<>();
    }

    /**
     * Adds a member as an attendee to the session.
     * @param member Member attending the session.
     */
    public void addAttendee(Member member) {
        attendees.add(member);
    }

    /**
     * Gets the agenda of the session.
     * @return Agenda of the session.
     */
    public String getAgenda() {
        return agenda;
    }

    /**
     * Gets the date of the session.
     * @return Date of the session.
     */
    public String getDate() {
        return date;
    }
}
