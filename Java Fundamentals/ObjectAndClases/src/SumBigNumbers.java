import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger firstNumb = scan.nextBigInteger();
        BigInteger secondNumb = scan.nextBigInteger();

        System.out.println(firstNumb.add(secondNumb));
    }
}
