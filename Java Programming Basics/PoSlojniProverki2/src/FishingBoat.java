import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fishermen = Integer.parseInt(scan.nextLine());

        double price = 0;
        boolean par = fishermen % 2 == 0;
        boolean seas = season.equals("Spring") || season.equals("Summer") || season.equals("Winter");

        if (season.equals("Spring")){
            if (fishermen <= 6){
                price = 3000 * 0.90;
            }else  if (fishermen > 6 && fishermen <= 11){
                price = 3000 * 0.85;
            }else if (fishermen > 12){
                price = 3000 * 0.75;
            }
        }else if (season.equals("Summer") || season.equals("Autumn")){
            if (fishermen <= 6){
                price = 4200 * 0.90;
            }else  if (fishermen > 6 && fishermen <= 11){
                price = 4200 * 0.85;
            }else if (fishermen > 12){
                price = 4200 * 0.75;
            }
        }else if (season.equals("Winter")){
            if (fishermen <= 6){
                price = 2600 * 0.90;
            }else  if (fishermen > 6 && fishermen <= 11){
                price = 2600 * 0.85;
            }else if (fishermen > 12){
                price = 2600 * 0.75;
            }
        }
        if (par && seas){
            price = price * 0.95;
        }
        double moneyLeft = budget - price;
        if (budget >=price){
            System.out.printf("Yes! You have %.2f leva left.",Math.abs(moneyLeft));
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",Math.abs(moneyLeft));
        }
    }
}
