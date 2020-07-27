import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int even = 0;
        int odd = 0;

        for (int i : numbers) {
            if (i % 2 == 0){
                even += i;
            }else {
                odd += i;
            }
        }
        int result = even - odd;
        System.out.println(result);
    }
        }
