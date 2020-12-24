import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeSet<String> allGuest = new TreeSet<>();

        String input = scan.nextLine();
        while (!"PARTY".equals(input)){

            allGuest.add(input);

            input = scan.nextLine();
        }

        input = scan.nextLine();
        while (!"END".equals(input)){

            allGuest.remove(input);

            input = scan.nextLine();
        }
        System.out.println(allGuest.size());
        for (String s : allGuest) {
            System.out.println(s);
        }
    }
}
