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



public class Updates {
    static ArrayList<Contacts> contacts = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static int mainMenu() {
        System.out.println("\nWhat would you like to do?");
        System.out.println("  1. View contacts");
        System.out.println("  2. Add a new contact");
        System.out.println("  3. Search a contact by name and/or phone number.");
        System.out.println("  4. Delete an existing contact.");
        System.out.println("  5. Exit");
        System.out.print("\nEnter an option (1, 2, 3, 4 or 5): ");

        Scanner myScanner = new Scanner(System.in);
        int userInput = myScanner.nextInt();
//        System.out.println("-----------------------------");
        return userInput;
    }

    public static void ViewContacts() throws IOException {
        System.out.println("Name | Phone Number\n-----------------------");
        Path dataFile = Paths.get("data", "contacts.txt");
        List<String> contacts = Files.readAllLines(dataFile);

        for (int i = 0; i < contacts.size(); i += 1) {
            System.out.println((i + 1) + ": " + contacts.get(i));
        }
    }

    public static void addContact() throws IOException {
        // Scanner scanner = new Scanner(System.in);
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

    public static void searchByName() throws IOException {

    }
    public static void deleteContact() throws IOException {

    }
    public static void exit() throws IOException {
        System.out.println("Goodbye!");
        System.exit(0);
    }
}
