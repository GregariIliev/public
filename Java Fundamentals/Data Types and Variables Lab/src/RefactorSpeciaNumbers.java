import java.util.Scanner;

public class RefactorSpeciaNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= number ; i++) {
            int sum = 0;
            int currentNumb = i;
            while (currentNumb > 0){
                int digit = currentNumb % 10;
                sum += digit;
                currentNumb = currentNumb / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(i + " -> True");
            }else {
                System.out.println(i + " -> False");
            }
        }
    }
}
