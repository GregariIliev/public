import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        boolean isTrue = false;
        for (int i = 0; i < arr.length; i++) {
            int big = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    isTrue = true;
                    big = arr[i];
                } else {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue && big > 0) {
                System.out.print(big + " ");
            }
        }
        System.out.println(arr[arr.length - 1]);
    }
}