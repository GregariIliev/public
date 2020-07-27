import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String index = scan.nextLine();
        String line = scan.nextLine();
        int numbIndex = Integer.parseInt(index);

        int bestSum = 0;
        int bestSequence = 0;
        int bestIndex = numbIndex;
        int bestDNA = 0;
        int inLine = 0;
        int[] bestArray = new int[numbIndex];
        while (!line.equals("Clone them!")) {
            int[] arr = new int[numbIndex];
            arr = Arrays.stream(line.split("!+")).mapToInt(e -> Integer.parseInt(e)).toArray();

            inLine++;
            int currentSequence = 0;
            int bestCurrentSequence = 0;
            int bestCurrentSum = 0;
            int bestCurrentIndex = numbIndex;

            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == 1) {
                    currentSequence++;
                    if (currentSequence >= bestCurrentSequence) {
                        bestCurrentSequence = currentSequence;
                        if (i < bestCurrentIndex) {
                            bestCurrentIndex = i;
                        }
                    }
                }else {
                    currentSequence = 0;
                }
                bestCurrentSum += arr[i];
            }
            if (bestCurrentSequence > bestSequence){
                bestIndex = bestCurrentIndex;
                bestDNA = inLine;
                bestArray = Arrays.stream(line.split("!+")).mapToInt(e -> Integer.parseInt(e)).toArray();
                bestSum = bestCurrentSum;
                bestSequence = bestCurrentSequence;
            }else if (bestCurrentSequence == bestSequence && bestCurrentIndex < bestIndex){
                bestIndex = bestCurrentIndex;
                bestDNA = inLine;
                bestArray = Arrays.stream(line.split("!+")).mapToInt(e -> Integer.parseInt(e)).toArray();
                bestSum = bestCurrentSum;
                bestSequence = bestCurrentSequence;
            }else if (bestCurrentSequence == bestSequence && bestCurrentIndex == bestIndex && bestCurrentSum > bestSum) {
                bestIndex = bestCurrentIndex;
                bestDNA = inLine;
                bestArray = Arrays.stream(line.split("!+")).mapToInt(e -> Integer.parseInt(e)).toArray();
                bestSum = bestCurrentSum;
                bestSequence = bestCurrentSequence;
            }
            // 1 1  0 0 1
            // 1 1  0 1 1
            line = scan.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n",bestDNA , bestSum);
        for (int i = 0; i < numbIndex; i++) {
            System.out.print(bestArray[i] + " ");
        }
    }
}
//5
//1!0!1!1!1
//0!1!1!1!0
//Clone them!

