import java.util.Scanner;

public class MetersToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int meter = Integer.parseInt(scan.nextLine());

        double kilometers = meter * 0.001;

        System.out.printf("%.2f",kilometers);
    }
}
