import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashSet<Integer> first = new LinkedHashSet<>();
        LinkedHashSet<Integer> second = new LinkedHashSet<>();

        int[] inputSize = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        addToSet(scan, first, inputSize[0]);
        addToSet(scan, second, inputSize[1]);

        first.retainAll(second);

        for (Integer integer : first) {
            System.out.print(integer + " ");
        }
    }

    private static void addToSet(Scanner scan, HashSet<Integer> first, int i1) {
        for (int i = 0; i < i1; i++) {
            int numb = Integer.parseInt(scan.nextLine());
            first.add(numb);
        }
    }
}
