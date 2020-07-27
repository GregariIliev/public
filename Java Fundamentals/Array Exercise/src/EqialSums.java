import java.util.Scanner;

public class EqialSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(" ");
        int[] numbers = new int[line.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);
        }
        int index = -1;
        boolean isTrue = true;
        for (int i = 0; i < numbers.length; i++) {
            index++;
            int leftSum = 0;
            int rightSum = 0;
            if (numbers.length == 1) {
                System.out.println("0");
                isTrue = false;
                break;
            }
            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }
            if (leftSum == rightSum) {
                isTrue = false;
                System.out.printf("%d",index);
            }
        }
        if (isTrue) {
            System.out.println("no");
        }
    }
}

