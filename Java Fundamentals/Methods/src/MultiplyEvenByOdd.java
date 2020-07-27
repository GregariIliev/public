import java.util.Scanner;

public class MultiplyEvenByOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numb = Integer.parseInt(scan.nextLine());

        System.out.println(multiplyEvenOdd(numb));
    }

    private static int multiplyEvenOdd(int numb) {
        int evenSUm = 0;
        int oddSUm = 0;
        int currentNumb = numb;

        while (currentNumb != 0 ) {
            int digit = currentNumb % 10;

            if (digit
                    % 2 == 0){
                evenSUm += digit;
            }else {
                oddSUm += digit;
            }

            currentNumb = currentNumb / 10;
        }
        int result = evenSUm * oddSUm;
        return result;
    }
}
