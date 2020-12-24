import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] sizeMatrix = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int row = sizeMatrix[0];
        int col = sizeMatrix[1];

        int[][] matrix = readMatrix(scan, row);

        sumSubMatrix2x2(matrix);


    }

    private static void sumSubMatrix2x2(int[][] matrix) {
        int sumMatrix = Integer.MIN_VALUE;
        int[] bestMatrix2x2 = new int[4];
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (currentSum > sumMatrix){
                    sumMatrix = currentSum;
                    bestMatrix2x2 = new int[]{matrix[row][col], matrix[row][col + 1], matrix[row + 1][col], matrix[row + 1][col + 1]};
                }
            }
        }
        for (int i = 0; i < bestMatrix2x2.length / 2; i++) {
            System.out.print(bestMatrix2x2[i] + " ");
        }
        System.out.println();
        for (int i = bestMatrix2x2.length / 2; i < bestMatrix2x2.length; i++) {
            System.out.print(bestMatrix2x2[i] + " ");
        }
        System.out.println();
        System.out.println(sumMatrix);
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
