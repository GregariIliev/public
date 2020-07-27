import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int snowballQuantity = Integer.parseInt(scan.nextLine());
        long snowballValue = 0;
        int bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;
        for (int i = 0; i < snowballQuantity; i++) {
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());
            double toDouble = 1.0 * snowballSnow / snowballTime;
            long currentSnowballValue = (long) Math.pow(toDouble, snowballQuality);
            if (currentSnowballValue > snowballValue){
                snowballValue = currentSnowballValue;
                bestSnowballSnow = snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %d (%d)",bestSnowballSnow , bestSnowballTime , snowballValue , bestSnowballQuality);
    }
}
