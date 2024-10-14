import java.util.ArrayList;
import java.util.List;

/**
 * Represents the legislative assembly.
 * Manages members, sessions, and legislative processes.
 */
public class LegislativeAssembly {
    private String name;
    private String location;
    private List<Member> members;
    private List<Session> sessions;

    /**
     * Constructor to initialize the legislative assembly with its name and location.
     * Initializes empty lists for members and sessions.
     * @param name Name of the assembly.
     * @param location Location of the assembly.
     */
    public LegislativeAssembly(String name, String location) {
        this.name = name;
        this.location = location;
        this.members = new ArrayList<>();
        this.sessions = new ArrayList<>();
    }

    /**
     * Adds a member to the legislative assembly.
     * @param member Member to add.
     */
    public void addMember(Member member) {
        members.add(member);
    }

    /**
     * Schedules a session for the legislative assembly.
     * @param session Session to schedule.
     */
    public void scheduleSession(Session session) {
        sessions.add(session);
    }

    /**
     * Gets the list of members in the legislative assembly.
     * @return List of members.
     */
    public List<Member> getMembers() {
        return members;
    }

    /**
     * Gets the list of sessions in the legislative assembly.
     * @return List of sessions.
     */
    public List<Session> getSessions() {
        return sessions;
    }
}
