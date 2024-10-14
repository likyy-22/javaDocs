import java.util.List;
import java.util.Scanner;

/**
 * Main class to manage the Goa Legislative Assembly system.
 * Provides functionalities such as adding members, scheduling sessions, proposing bills, and voting on bills.
 */
public class App {
    static LegislativeAssembly assembly = new LegislativeAssembly("Goa Legislative Assembly", "Panaji");
    static Scanner scanner = new Scanner(System.in);

    /**
     * Main method to run the menu-based system.
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nGoa Legislative Assembly Management System");
            System.out.println("1. Add Member");
            System.out.println("2. Schedule Session");
            System.out.println("3. Propose Bill");
            System.out.println("4. Vote on Bill");
            System.out.println("5. Display Members");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addMember();
                    break;
                case 2:
                    scheduleSession();
                    break;
                case 3:
                    proposeBill();
                    break;
                case 4:
                    voteOnBill();
                    break;
                case 5:
                    displayMembers();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }

    /**
     * Adds a new member to the legislative assembly.
     * Collects member details from the user and creates a new Member object.
     */
    public static void addMember() {
        System.out.print("Enter Member Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Constituency Name: ");
        String constituencyName = scanner.nextLine();
        System.out.print("Enter Population: ");
        int population = scanner.nextInt();
        scanner.nextLine();
        Constituency constituency = new Constituency(constituencyName, population);
        System.out.print("Enter Party: ");
        String party = scanner.nextLine();
        System.out.print("Enter Contact Info: ");
        String contactInfo = scanner.nextLine();
        Member member = new Member(name, constituency, party, contactInfo);
        assembly.addMember(member);
        System.out.println("Member added successfully.");
    }

    /**
     * Schedules a session for the legislative assembly.
     * Collects session details such as date and agenda from the user.
     */
    public static void scheduleSession() {
        System.out.print("Enter Session Date: ");
        String date = scanner.nextLine();
        System.out.print("Enter Agenda: ");
        String agenda = scanner.nextLine();
        Session session = new Session(date, agenda);
        assembly.scheduleSession(session);
        System.out.println("Session scheduled successfully.");
    }

    /**
     * Proposes a new bill in the assembly by a member.
     * The user provides the member's name and bill details.
     */
    public static void proposeBill() {
        System.out.print("Enter Member Name: ");
        String name = scanner.nextLine();
        Member member = findMemberByName(name);
        if (member != null) {
            System.out.print("Enter Bill Title: ");
            String title = scanner.nextLine();
            System.out.print("Enter Bill Description: ");
            String description = scanner.nextLine();
            Bill bill = new Bill(title, description);
            member.proposeBill(bill);
            System.out.println("Bill proposed successfully.");
        } else {
            System.out.println("Member not found.");
        }
    }

    /**
     * Records a member's vote on a bill.
     * The user provides the member's name, the bill's title, and the vote (yes/no).
     */
    public static void voteOnBill() {
        System.out.print("Enter Member Name: ");
        String name = scanner.nextLine();
        Member member = findMemberByName(name);
        if (member != null) {
            System.out.print("Enter Bill Title: ");
            String title = scanner.nextLine();
            System.out.print("Enter Vote (yes/no): ");
            String vote = scanner.nextLine();
            Bill bill = new Bill(title, "");
            member.voteOnBill(bill, vote);
            System.out.println("Vote recorded successfully.");
        } else {
            System.out.println("Member not found.");
        }
    }

    /**
     * Displays a list of all the members in the legislative assembly.
     */
    public static void displayMembers() {
        List<Member> members = assembly.getMembers();
        if (members.isEmpty()) {
            System.out.println("No members found.");
        } else {
            System.out.println("Members of the Goa Legislative Assembly:");
            for (Member member : members) {
                System.out.println("Name: " + member.getName() + ", Constituency: " + member.getConstituency().getDetails() +
                        ", Party: " + member.getParty() + ", Contact Info: " + member.getContactInfo());
            }
        }
    }

    /**
     * Finds a member in the legislative assembly by name.
     * @param name Name of the member to search for.
     * @return Member object if found, otherwise null.
     */
    public static Member findMemberByName(String name) {
        for (Member member : assembly.getMembers()) {
            if (member.getName().equalsIgnoreCase(name)) {
                return member;
            }
        }
        return null;
    }
}
