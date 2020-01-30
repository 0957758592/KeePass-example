package kepass;

// Import required class
import de.slackspace.openkeepass.KeePassDatabase;
import de.slackspace.openkeepass.domain.Entry;
import de.slackspace.openkeepass.domain.KeePassFile;
import java.util.List;

//OBTAINING A SINGLE CREDENTIAL BY ITS TITLE
//As there's no indexation through ID's or something numerical, the only way to obtain a single credential from the database is through it's title, for example:

public class Index3 {

    public static void main(String[] args){

        // 1. Open a KeePass database file through a plain text password
        KeePassFile database = KeePassDatabase
            .getInstance("C:\\Users\\sdkca\\Documents\\Database.kdbx")
            .openDatabase("12345");

        // 2. Find single credential by title
        Entry sampleEntry = database.getEntryByTitle("Sample Entry");
        System.out.println("Title: " + sampleEntry.getTitle() + " Password: " + sampleEntry.getPassword());
    }
}
