import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumb = Integer.parseInt(scan.nextLine());
        int secondNumb = Integer.parseInt(scan.nextLine());

        divisionFactorial(factorial(firstNumb), factorial(secondNumb));
    }

    private static void divisionFactorial(long firstFactorial, long secondFactorial) {
        double result = 1.0 * firstFactorial / secondFactorial;
        System.out.printf("%.2f",result);

    }

    private static long factorial(long firstNumb) {

        for (long i = firstNumb - 1; i >  1; i--) {
            firstNumb = firstNumb * i;
    }
        return firstNumb;
    }
}
