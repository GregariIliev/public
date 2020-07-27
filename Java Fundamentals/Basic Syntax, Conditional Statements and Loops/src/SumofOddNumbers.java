import java.util.Scanner;

public class SumofOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numb = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 1; i <= numb * 2; i+= 2) {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println("Sum: " + sum);
    }
}
