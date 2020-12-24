package CardSuit;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        if (input.equals("Card Suits")){
            System.out.println("Card Suits:");
            Arrays.stream(CardType.values()).forEach(e -> {
                System.out.printf("Ordinal value: %d; Name value: %s%n",e.ordinal(), e);
            });
        }
    }
}
