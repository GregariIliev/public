import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] strToInt = scan.nextLine().split(" ");
        int[] numbers = Arrays.stream(strToInt).mapToInt(e -> Integer.parseInt(e)).toArray();

    }
}
