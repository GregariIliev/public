package HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        double pricePerDay = Double.parseDouble(input[0]);
        int numberOfDays = Integer.parseInt(input[1]);
        Seasons seasons = Seasons.valueOf(input[2]);
        Discount discount = Discount.valueOf(input[3]);

        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay, numberOfDays, seasons, discount);

        System.out.printf("%.2f",priceCalculator.calculateHoliday());
    }
}
