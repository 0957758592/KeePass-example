package kepass;

// Import required class
import de.slackspace.openkeepass.KeePassDatabase;
import de.slackspace.openkeepass.domain.Entry;
import de.slackspace.openkeepass.domain.KeePassFile;
import java.util.List;

public class Index {

    public static void main(String[] args){

        // 1. Open a KeePass database file through a plain text password
        KeePassFile database = KeePassDatabase
            .getInstance("C:\\Users\\sdkca\\Documents\\Database.kdbx")
            .openDatabase("12345");

        // 2. Retrieve all entries
        List<Entry> entries = database.getEntries();

        // 3. Print every entry
        for (Entry entry : entries) {
            System.out.println("    * Credential: " + entry.getTitle());
            System.out.println("        Username: " + entry.getUsername());
            System.out.println("        Password: " + entry.getPassword());
        }
    }
}