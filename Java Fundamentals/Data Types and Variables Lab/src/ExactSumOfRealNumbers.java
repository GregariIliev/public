import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        BigDecimal result = new BigDecimal(0);
        for (int i = 1; i <= n ; i++) {
            BigDecimal numb = new BigDecimal(scan.nextLine());
            result = result.add(numb);
        }
        System.out.println(result);
    }
}
