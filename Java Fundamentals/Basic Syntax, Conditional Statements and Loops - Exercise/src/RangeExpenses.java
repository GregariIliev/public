
import java.util.Scanner;

public class RangeExpenses {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGame = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());


        int headsetCount = lostGame / 2;
        int mouseCount = lostGame / 3;
        int keyboardCount = lostGame / 6;
        int displayCount = lostGame / 12;

        double finalPriceHeadset = headsetPrice * headsetCount;
        double finalPriceMouse = mousePrice * mouseCount;
        double finalPriceKeyboard = keyboardPrice * keyboardCount;
        double finalPriceDisplay = displayPrice * displayCount;

        double finalPrice = finalPriceHeadset
                + finalPriceMouse + finalPriceKeyboard
                + finalPriceDisplay;

        System.out.printf("Rage expenses: %.2f lv.", finalPrice);


    }
}


