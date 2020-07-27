import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            boolean isTrue = false;
            int currentNumb = i;
            while (currentNumb > 0){
                int digit = 0;
                digit = currentNumb % 10;
                if (digit % 2 == 1) {
                    isTrue = true;
                }
                currentNumb = currentNumb / 10;
            }

            if (isTrue){
                int currentNumber = i;
                int digit = 0;
                while (currentNumber > 0){
                    digit += currentNumber % 10;
                    currentNumber = currentNumber / 10;
                }
                if (digit % 8 == 0){
                    System.out.println(i);
                }
            }

        }
    }
}
