import java.util.Scanner;

public class ShwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double recordSec = Double.parseDouble(scan.nextLine());
        double distanceMeter = Double.parseDouble(scan.nextLine());
        double secForMeter = Double.parseDouble(scan.nextLine());

        double timeShimming = distanceMeter * secForMeter;
        double zabavqneMetri = Math.floor(distanceMeter / 15);
        double zabavqneSec = zabavqneMetri * 12.5;
        double finalTime = timeShimming + zabavqneSec;
        double timeLeft = recordSec - finalTime;

        if (finalTime < recordSec){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",finalTime);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(timeLeft));
        }
    }
}
