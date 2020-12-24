package CardsWhitPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String rankCard = scan.nextLine();
        String suitCard = scan.nextLine();

        int powerCard = CardRanks.valueOf(rankCard).getRankPower() + CardSuit.valueOf(suitCard).getTypePower();

        System.out.printf("Card name: %s of %s; Card power: %d",rankCard, suitCard, powerCard);
    }
}
