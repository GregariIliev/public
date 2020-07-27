import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startNumb = Integer.parseInt(scan.nextLine());
        int endNumb = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int i = startNumb; i <= endNumb ; i++) {
            sum = sum + i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
