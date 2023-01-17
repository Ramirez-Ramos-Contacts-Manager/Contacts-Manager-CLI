package ContactsManager;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Updates {
    static ArrayList<Contacts> contacts = new ArrayList<>();

    public static void ViewContacts() throws IOException {

    }

    public static void addContact() throws IOException {
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
