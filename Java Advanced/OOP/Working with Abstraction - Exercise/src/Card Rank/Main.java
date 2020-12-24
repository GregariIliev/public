import CardRank.CardRanks;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String input = scan.nextLine();
        if (input.equals("Card Ranks")){
            System.out.println("Card Ranks:");
            Arrays.stream(CardRanks.values()).forEach(e -> {
                System.out.printf("Ordinal value: %d; Name value: %s%n",e.ordinal(), e);
            });
        }
    }
}
