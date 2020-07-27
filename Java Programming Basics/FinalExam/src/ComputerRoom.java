import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int hours = Integer.parseInt(scan.nextLine());
        int numberOfPeople = Integer.parseInt(scan.nextLine());
        String dayOrNight = scan.nextLine();

        double priceToPerson = 0;
        double totalCost = 0;
        if (month.equals("march") || month.equals("april") || month.equals("may")) {
            if (dayOrNight.equals("day")) {
                priceToPerson = 10.50;
                if (numberOfPeople >= 4) {
                    priceToPerson = priceToPerson * 0.90;
                }
                if (hours >= 5) {
                    priceToPerson = priceToPerson * 0.50;
                }
                totalCost = priceToPerson * hours * numberOfPeople;
            } else if (dayOrNight.equals("night")) {
                priceToPerson = 8.40;
                if (numberOfPeople >= 4) {
                    priceToPerson = priceToPerson * 0.90;
                }
                if (hours >= 5) {
                    priceToPerson = priceToPerson * 0.50;
                }
                totalCost = priceToPerson * hours * numberOfPeople;
            }
        }else if (month.equals("june") || month.equals("july") || month.equals("august")) {
            if (dayOrNight.equals("day")) {
                priceToPerson = 12.60;
                if (numberOfPeople >= 4) {
                    priceToPerson = priceToPerson * 0.90;
                }
                if (hours >= 5) {
                    priceToPerson = priceToPerson * 0.50;
                }
                totalCost = priceToPerson * hours * numberOfPeople;
            } else if (dayOrNight.equals("night")) {
                priceToPerson = 10.20;
                if (numberOfPeople >= 4) {
                    priceToPerson = priceToPerson * 0.90;
                }
                if (hours >= 5) {
                    priceToPerson = priceToPerson * 0.50;
                }
                totalCost = priceToPerson * hours * numberOfPeople;
            }
        }

        System.out.printf("Price per person for one hour: %.2f%n",priceToPerson);
        System.out.printf("Total cost of the visit: %.2f",totalCost);
    }
}
