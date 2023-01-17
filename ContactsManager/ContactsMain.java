package ContactsManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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



        }
    }
//      List<String, Integer> contactsList = Arrays.asList("", "milk", "sugar");
//
//    Path filepath = Paths.get("data", "groceries.txt");
//
//        Files.write(filepath, groceryList);
