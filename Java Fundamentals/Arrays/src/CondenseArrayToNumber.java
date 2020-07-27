import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int i = 0; i < numbers.length -1; ) {
            int[] condensed = new int[numbers.length - 1];
            for (int j = 0; j < condensed.length; j++) {
                condensed[j] = numbers[j] + numbers[j + 1];
            }
            numbers = condensed;
        }
        System.out.println(numbers[0]);

    }
}
