import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numbOfNumbers = Integer.parseInt(scan.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        for (int i = 1; i <= numbOfNumbers; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            if (currentNumber % 2 == 0) {
                p1++;
            }
            if (currentNumber % 3 == 0) {
                p2++;
            }
            if (currentNumber % 4 == 0) {
                p3++;
            }
        }
        double p1Percent = p1 / numbOfNumbers * 100;
        double p2Percent = p2 / numbOfNumbers * 100;
        double p3Percent = p3 / numbOfNumbers * 100;
        System.out.printf("%.2f%%%n", p1Percent);
        System.out.printf("%.2f%%%n", p2Percent);
        System.out.printf("%.2f%%%n", p3Percent);
    }
}

