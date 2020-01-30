package kepass;

// Import required class
import de.slackspace.openkeepass.KeePassDatabase;
import de.slackspace.openkeepass.domain.Entry;
import de.slackspace.openkeepass.domain.KeePassFile;
import java.util.List;

public class Index {

    //PRINTING ALL CREDENTIALS
    //If you just obtained a KeePass database from someone and you only need to obtain the information without worrying about categorization, you can easily print all the stored credentials in the file with the following logic:

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