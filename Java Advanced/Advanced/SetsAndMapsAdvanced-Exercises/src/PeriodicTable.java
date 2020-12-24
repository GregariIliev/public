import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeSet<String> chemicalElements = new TreeSet<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split("\\s+");
            chemicalElements.addAll(Arrays.asList(line));
        }

        for (String chemicalElement : chemicalElements) {
            System.out.print(chemicalElement + " ");
        }
    }
}
