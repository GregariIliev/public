import java.util.Scanner;

public class SumPrimeNoPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;
        while (!text.equals("stop")){
            int currentNumb = Integer.parseInt(text);
            boolean isNonPrime = false;
            if (currentNumb < 0){
                System.out.println("Number is negative.");
            }
            if (currentNumb > 1){
                for (int i = currentNumb; i > 2 ;) {
                    i -= 1;
                    if (currentNumb % i == 0) {
                        isNonPrime = true;
                        nonPrimeSum += currentNumb;
                        break;
                    }
                }
                if (!isNonPrime){
                    primeSum += currentNumb;
                }
            }
            text = scan.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n",primeSum);
        System.out.printf("Sum of all non prime numbers is: %d",nonPrimeSum);
    }
}
