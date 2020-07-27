import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arrInput = scan.nextLine().split("\\s+");

        Integer[] sequence = new Integer[arrInput.length];

        int sumOfAllNumbSequence = 0;
        for (int i = 0; i < arrInput.length; i++) {
            sequence[i] = Integer.parseInt(arrInput[i]);
            sumOfAllNumbSequence = sumOfAllNumbSequence + sequence[i];
        }

        int countSequenceSymbols = sequence.length;
        double averageNumber = 1.0 * sumOfAllNumbSequence / countSequenceSymbols;
        boolean noHaveAverageNumbers = true;
        List<Integer> sequenceListGreatNumbs = new ArrayList<>();

        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] > averageNumber){
                sequenceListGreatNumbs.add(sequence[i]);
                noHaveAverageNumbers = false;
            }
        }
        Collections.sort(sequenceListGreatNumbs);
        int count = 0;
        if (noHaveAverageNumbers){
            System.out.println("No");
        }else {
            for (int i = sequenceListGreatNumbs.size() - 1; i >= 0; i--) {
                count++;
                if (count <= 5){
                    System.out.print(sequenceListGreatNumbs.get(i) + " ");
                }else {
                    break;
                }
            }
        }

    }
}
