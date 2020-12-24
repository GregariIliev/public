import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[][] matrix = readMatrix(scan, n);

        int firstDiagonalSum = firstDiagonalSum(matrix);
        int secondDiagonalSum = secondDiagonalSum(matrix);

        int result = firstDiagonalSum - secondDiagonalSum;
        System.out.println(Math.abs(result));
    }

    private static int secondDiagonalSum(int[][] matrix) {
        int sum = 0;
        int row = matrix.length - 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int i = row; i >= 0 ;) {
                sum += matrix[i][col];
                break;
            }
            row--;
        }

        return sum;
    }

    private static int firstDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col){
                    sum += matrix[row][col];
                }
            }
        }
        return sum;
    }

    private static int[][] readMatrix(Scanner scan, int n) {
        int[][] matrix = new int[n][n];
        for (int row = 0; row < matrix.length; row++) {
            int[] matrixLine = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = matrixLine;
        }
        return matrix;
    }
}
