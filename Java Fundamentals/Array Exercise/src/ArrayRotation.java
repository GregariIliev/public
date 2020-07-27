import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().split(" ");
        int rotNumber = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < rotNumber; i++) {
            String symbol = arr[0];
            for (int j = i; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = symbol;
        }
        System.out.println(String.join(" ",arr));
    }
}
