package kepass;

// Import required class
import de.slackspace.openkeepass.KeePassDatabase;
import de.slackspace.openkeepass.domain.Entry;
import de.slackspace.openkeepass.domain.KeePassFile;
import java.util.List;

public class Index4 {

    public static void main(String[] args){

        // 1. Open a KeePass database file through a plain text password
        KeePassFile database = KeePassDatabase
            .getInstance("C:\\Users\\sdkca\\Documents\\Database.kdbx")
            .openDatabase("12345");

        // 2. Search for all entries that contain 'Sample' in title
        List<Entry> entriesByTitle = database.getEntriesByTitle("Sample", false);
        for (Entry entry : entriesByTitle) {
            System.out.println("Title: " + entry.getTitle() + " Password: " + entry.getPassword());
        }
    }
}