import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int row = input[0];
        int col = input[1];

        String[][] matrix = new String[row][col];

        char symbol = 'a';

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                matrix[rows][cols] = "" + symbol + (char)(symbol + cols) + symbol;
                System.out.print(matrix[rows][cols] + " ");
            }
            symbol++;
            System.out.println();
        }
    }
}
