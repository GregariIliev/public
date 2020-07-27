import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double currentSpeed = Double.parseDouble(scan.nextLine());
        double fuel100Km = Double.parseDouble(scan.nextLine());

        double totalDistance = (384400 * 2);
        double timeGoAndBack = totalDistance / currentSpeed;
        double totalTime = timeGoAndBack + 3;
        double totalFuel = (fuel100Km * totalDistance) / 100;

        System.out.printf("%.0f%n",Math.ceil(totalTime));
        System.out.printf("%.0f",totalFuel);
    }
}
