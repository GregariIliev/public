import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double firstNum = Double.parseDouble(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());

        numbPower(firstNum ,secondNum);

        System.out.println(new DecimalFormat("0.####").format(numbPower(firstNum , secondNum)));
    }

    private static double numbPower(double firstNum, int secondNum) {
        double result = 1;
        for (int i = 0; i < secondNum; i++) {
            result = result * firstNum;
        }

        return result;
    }
}
