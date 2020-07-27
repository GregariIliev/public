import java.util.Scanner;

public class PoundsToDollar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pounds = Double.parseDouble(scan.nextLine());

        double BritishDollar = 1.31;

        double result = pounds * BritishDollar;

        System.out.printf("%.3f",result);
    }
}
