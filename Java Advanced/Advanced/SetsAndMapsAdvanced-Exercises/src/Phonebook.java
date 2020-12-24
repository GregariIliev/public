import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> phoneBook = new HashMap<>();

        String input = scan.nextLine();
        while (!"search".equals(input)) {

            String[] tokens = input.split("-");
            String name = tokens[0];
            String phone = tokens[1];

            phoneBook.put(name, phone);

            input = scan.nextLine();
        }

        input = scan.nextLine();
        while (!"stop".equals(input)) {

            if (phoneBook.containsKey(input)) {
                System.out.printf("%s -> %s%n", input, phoneBook.get(input));
            } else {
                System.out.printf("Contact %s does not exist.%n", input);
            }

            input = scan.nextLine();
        }

    }
}