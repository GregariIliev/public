import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int even = 0;
        int odd = 0;
        for (int a = 1 ; a <= n ; a++){
            if (a % 2 == 0) {
                int b = Integer.parseInt(scan.nextLine());
                even = even + b;
            }else {
                int b = Integer.parseInt(scan.nextLine());
                odd = odd + b;
            }
        }
        int diff = even - odd;
        if (even == odd){
            System.out.println("Yes");
            System.out.printf("Sum = %d",even);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(diff));
        }
    }
}
