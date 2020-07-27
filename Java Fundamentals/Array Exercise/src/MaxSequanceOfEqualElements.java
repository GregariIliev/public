import java.util.Arrays;
import java.util.Scanner;

public class MaxSequanceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int firstSeq = 0;
        int endSeq = 0;
        int currentIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            int startIndex = -1;
            startIndex++;
            int endIndex = -1;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] != numbers[j]) {
                    break;
                }
                endIndex++;
            }
            if (firstSeq + endSeq < startIndex + endIndex){
                firstSeq = startIndex;
                endSeq = endIndex;
                currentIndex = numbers[i];
            }
        }
        int longSeq = firstSeq + endSeq + 1;
        for (int i = 0; i < longSeq; i++) {
            System.out.print(currentIndex + " ");
        }
    }
}
