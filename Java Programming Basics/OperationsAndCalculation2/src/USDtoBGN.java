import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double USD = Double.parseDouble(scan.nextLine());
        double toBGN = USD * 1.79549;
        System.out.printf("%.2f",toBGN);
    }
}
