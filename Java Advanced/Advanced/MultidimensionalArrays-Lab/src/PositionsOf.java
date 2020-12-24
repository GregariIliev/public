import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] sizeMatrix = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = sizeMatrix[0];
        int cols = sizeMatrix[1];

        int[][] matrix = new int[rows][cols];

        readMatrix(scan, rows, matrix);

        int numberToSearch = Integer.parseInt(scan.nextLine());

        findNumberInMatrix(matrix, numberToSearch);

    }

    private static void findNumberInMatrix(int[][] matrix, int numberToSearch) {
        int row = 0;
        int col = 0;
        boolean found = false;
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                if (matrix[rows][cols] == numberToSearch){
                    row = rows;
                    col = cols;
                    System.out.println(row + " " + col);
                    found = true;
                }
            }
        }
        if (!found){
            System.out.println("not found");
        }
    }

    private static void readMatrix(Scanner scan, int rows, int[][] matrix) {
        for (int row = 0; row < rows; row++) {
            int[] matrixLine = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = matrixLine;
        }
    }
}
