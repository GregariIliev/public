import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int sumOfDigits = 0;
        while(num > 0){
            int digit = num % 10;
            sumOfDigits += digit;
            num = num / 10;
        }

        System.out.println(sumOfDigits);

    }
}
