package kepass;

// Import required class
import de.slackspace.openkeepass.KeePassDatabase;
import de.slackspace.openkeepass.domain.Entry;
import de.slackspace.openkeepass.domain.Group;
import de.slackspace.openkeepass.domain.KeePassFile;
import java.util.List;

public class Index2 {


    //PRINTING INFORMATION IN A STRUCTURED WAY (BY GROUPS)
    //As a regular user of the Keepass application, i love to categorize the credentials that i store on my file using groups and subgroups. For example, separating the credentials from my personal life with job related accounts:
    public static void main(String[] args){

        // 1. Open a KeePass database file through a plain text password
        KeePassFile database = KeePassDatabase
            .getInstance("C:\\Users\\sdkca\\Documents\\Database.kdbx")
            .openDatabase("12345");

        // 2. Obtain the top groups in the database
        List<Group> keePassGroups = database.getTopGroups();

        // 3. Iterate over theme
        for (Group group : keePassGroups) {

            // 4. Print the name of the Group
            System.out.println(" - " + group.getName());

            // 5. List credentials inside this group
            List<Entry> groupEntries = group.getEntries();

            // 6. Print every credential inside the group
            for (Entry entry : groupEntries) {
                System.out.println("    * Credential: " + entry.getTitle());
                System.out.println("        Username: " + entry.getUsername());
                System.out.println("        Password: " + entry.getPassword());
            }
        }
    }
}
