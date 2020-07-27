import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int extras = Integer.parseInt(scan.nextLine());
        double priceClothing = Double.parseDouble(scan.nextLine());

        double decor = budget * 0.1;
        double allPriceClothing = extras * priceClothing;
        if (extras > 150){
            allPriceClothing = allPriceClothing * 0.9;
        }
        double moneyForMovie = decor + allPriceClothing;
        double moneyLeft = moneyForMovie - budget;

        if (moneyForMovie > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",moneyLeft);
        }else if (moneyForMovie <= budget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",Math.abs(moneyLeft));
        }


    }
}
