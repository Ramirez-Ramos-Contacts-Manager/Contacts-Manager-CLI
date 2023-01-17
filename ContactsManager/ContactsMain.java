package ContactsManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
            System.out.println();


            ArrayList<Contacts> contacts = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            System.out.print("  Enter A Name: ");
            String Name = scanner.nextLine();
            System.out.print("  Enter A Phone Number : ");
            String phoneNumber = scanner.nextLine();
            Files.write(
                    Paths.get("data", "contacts.txt"),
                    Arrays.asList(Name + " " + " | " + phoneNumber),
                    StandardOpenOption.APPEND
            );
            contacts.add(new Contacts(Name, phoneNumber));
            System.out.println(Name + " " + " has been successfully added to the contact list ");
        }
        }


