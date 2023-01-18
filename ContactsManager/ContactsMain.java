package ContactsManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ContactsMain {
    public static void main(String[] args) throws IOException {
        String directory = "data";
        String contactsFile = "contacts.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, contactsFile);

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (!Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }


        while (true) {
            int userInput = Updates.mainMenu();
            if (userInput == 1)
                Updates.ViewContacts();
            else if (userInput == 2)
                Updates.addContact();
            else if (userInput == 3)
                Updates.searchByName();
            else if (userInput == 4) {
                Updates.deleteContact();
            } else if (userInput == 5) {
                Updates.exit();
            } else
                System.out.println("Invalid input.");
        }
    }
}


