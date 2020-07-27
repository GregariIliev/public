import java.util.Scanner;

public class EqSumEvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumb = Integer.parseInt(scan.nextLine());
        int secondNumb = Integer.parseInt(scan.nextLine());

        int evenPosition = 0;
        int oddPosition = 0;
        int currentNumb = 0;

        for (int i = firstNumb; i <= secondNumb ; i++) {
            for (int currentN = firstNumb; currentN <= secondNumb; currentN++) {
                currentNumb = currentN % 10;
                currentN = currentN / 10;
            }
        }

    }
}
