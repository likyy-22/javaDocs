/**
 * Represents a member of the legislative assembly.
 * Contains details about the member's name, constituency, party, and contact info.
 */
public class Member {
    private String name;
    private Constituency constituency;
    private String party;
    private String contactInfo;

    /**
     * Constructor to initialize a member with their details.
     * @param name Name of the member.
     * @param constituency Constituency represented by the member.
     * @param party Political party of the member.
     * @param contactInfo Contact information of the member.
     */
    public Member(String name, Constituency constituency, String party, String contactInfo) {
        this.name = name;
        this.constituency = constituency;
        this.party = party;
        this.contactInfo = contactInfo;
    }

    /**
     * Records the member's attendance at a session.
     * @param session Session to attend.
     */
    public void attendSession(Session session) {
        session.addAttendee(this);
    }

    /**
     * Proposes a bill in the legislative assembly.
     * @param bill Bill proposed by the member.
     */
    public void proposeBill(Bill bill) {
        System.out.println(this.name + " has proposed the bill: " + bill.getTitle());
    }

    /**
     * Records the member's vote on a bill.
     * @param bill Bill to vote on.
     * @param vote Vote ("yes" or "no").
     */
    public void voteOnBill(Bill bill, String vote) {
        System.out.println(this.name + " has voted " + vote + " on the bill: " + bill.getTitle());
    }

    /**
     * Gets the name of the member.
     * @return Name of the member.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the constituency represented by the member.
     * @return Constituency object.
     */
    public Constituency getConstituency() {
        return constituency;
    }

    /**
     * Gets the political party of the member.
     * @return Party name.
     */
    public String getParty() {
        return party;
    }

    /**
     * Gets the contact information of the member.
     * @return Contact information.
     */
    public String getContactInfo() {
        return contactInfo;
    }
}
