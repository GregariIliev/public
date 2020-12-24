import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] sizeMatrix = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = sizeMatrix[0];
        int cols = sizeMatrix[1];

        int[][] matrix = readMatrix(scan, rows);

        int sumMatrixElements = sumMatrixElements(matrix);

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sumMatrixElements);
    }

    private static int sumMatrixElements(int[][] matrix) {
        int sumOfElements = 0;
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sumOfElements += matrix[row][col];
            }
        }
        return sumOfElements;
    }

    private static int[][] readMatrix(Scanner scan, int rows) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            int[] matrixLine = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = matrixLine;
        }
        return matrix;
    }
}
