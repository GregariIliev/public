import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumb = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int secondNumb = Integer.parseInt(scan.nextLine());

        System.out.println(new DecimalFormat("0.####").format(calculate(firstNumb, operator, secondNumb)));
    }

    private static double calculate(int firstNumb, String operator, int secondNumb) {
        double result = 0;
        switch (operator) {
            case "+":
                result = firstNumb + secondNumb;
                break;
            case "-":
                result = firstNumb - secondNumb;
                break;
            case "*":
                result = firstNumb * secondNumb;
                break;
            case "/":
                result = 1.0 * firstNumb / secondNumb;
                break;
        }
        return result;
    }
}
