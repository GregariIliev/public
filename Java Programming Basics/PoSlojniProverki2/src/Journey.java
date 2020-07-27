import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String country = "";
        double moneySpent = 0;
        String  place = "";

        if(budget <= 100){
            country =  "Bulgaria";
            if(season.equals("summer")){
                place = "Camp";
                moneySpent = budget * 0.30;
            }else if (season.equals("winter")){
                place = "Hotel";
                moneySpent = budget * 0.70;
            }
        }else if(budget > 100 && budget <= 1000){
            country =  "Balkans ";
            if(season.equals("summer")){
                place = "Camp";
                moneySpent = budget * 0.40;
            }else if (season.equals("winter")){
                place = "Hotel";
                moneySpent = budget * 0.80;
            }
        }else if(budget > 1000){
            country =  "Europe";
            if(season.equals("summer")){
                place = "Hotel";
                moneySpent = budget * 0.90;
            }else if (season.equals("winter")){
                place = "Hotel";
                moneySpent  = budget * 0.90;
            }
        }
        if(budget <= 100){
            System.out.printf("Somewhere in %s %n",country);
            System.out.printf("%s - %.2f",place ,Math.abs(moneySpent));
        }else if (budget > 100 && budget <= 1000){
            System.out.printf("Somewhere in %s %n",country);
            System.out.printf("%s - %.2f",place ,Math.abs(moneySpent));
        }else if (budget > 1000){
            System.out.printf("Somewhere in %s %n",country);
            System.out.printf("%s - %.2f",place ,Math.abs(moneySpent));
        }
    }
}
