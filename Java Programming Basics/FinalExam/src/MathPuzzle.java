import java.util.Scanner;

public class MathPuzzle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int theKey = Integer.parseInt(scan.nextLine());

        int resultSum = 0;
        int resultMultiply = 0;
        boolean isTrue = false;
        for (int a = 1; a <= 30; a++) {
            for (int b = 1; b <= 30; b++) {
                for (int c = 1; c <= 30; c++) {
                    if (a < b && b < c) {
                        resultSum = a + b + c;
                        if (resultSum == theKey) {
                            isTrue = true;
                            System.out.printf("%d + %d + %d = %d%n", a, b, c, resultSum);
                        }
                    }
                    if (a > b && b > c) {
                        resultMultiply = a * b * c;
                        if (resultMultiply == theKey) {
                            isTrue = true;
                            System.out.printf("%d * %d * %d = %d%n", a, b, c, resultMultiply);
                        }

                    }

                }
            }
        }
        if (!isTrue){
            System.out.println("No!");
        }
    }
}
