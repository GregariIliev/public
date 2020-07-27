import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int installments = Integer.parseInt(scan.nextLine());
        int count = 1;
        double sum = 0;
        while (count <= installments){
            double number = Double.parseDouble(scan.nextLine());
            if (number < 0){
                System.out.println("Invalid operation");
                break;
            }
            System.out.printf("Increase: %.2f%n",number);
            sum = sum + number;
            count++;

        }
        System.out.printf("Total: %.2f",sum);
    }
}
