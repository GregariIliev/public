import java.util.Scanner;

public class InchToCentimeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inch = Integer.parseInt(scan.nextLine());
        double centimeters = inch * 2.54;
        System.out.println(centimeters);

    }
}
