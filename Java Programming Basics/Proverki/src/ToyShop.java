import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double cenaEkskurzia = Double.parseDouble(scan.nextLine());
        int puzzles = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        double puzzlePrice = puzzles * 2.6;
        double dollsPrice = dolls * 3;
        double bearsPrice = bears * 4.1;
        double mininsPrice = minions * 8.2;
        double trucksPrice = trucks * 2;

        double allPriceToys = puzzlePrice+dollsPrice+bearsPrice+mininsPrice+trucksPrice;
        int toysCuant = puzzles+dolls+bears+minions+trucks;
        double discunt = 0;
        if (toysCuant>=50){
            allPriceToys = allPriceToys * 0.75;
        }
        double finalPrice = allPriceToys - discunt;
        finalPrice = finalPrice - (finalPrice * 0.10);

        if (finalPrice>=cenaEkskurzia){
            System.out.printf("Yes! %.2f lv left.",finalPrice - cenaEkskurzia);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",Math.abs(finalPrice-cenaEkskurzia));
        }

    }
}
