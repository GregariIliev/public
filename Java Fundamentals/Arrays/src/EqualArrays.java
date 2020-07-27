import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstLine = scan.nextLine().split(" ");
        String[] secondLine = scan.nextLine().split(" ");
        int[] numbers = Arrays.stream(firstLine).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;
        boolean isTrue = false;
        for (int i = 0; i < firstLine.length; i++) {
            if (!firstLine[i].equals(secondLine[i])){
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                return;
            }else {
                sum += numbers[i];
                isTrue = true;
            }
        }if (isTrue) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
