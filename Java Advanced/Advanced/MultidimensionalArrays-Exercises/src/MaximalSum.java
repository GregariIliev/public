import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] size = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int row = size[0];
        int col = size[1];

        int[][] inputMatrix = readMatrix(scan, row, col);
        int[][] bestMatrix3X3 = new int[3][3];
        int rowPosition = 0;
        int colPosition = 0;

        int sum = Integer.MIN_VALUE;
        for (int rows = 0; rows < inputMatrix.length - 2; rows++) {
            for (int cols = 0; cols < inputMatrix[rows].length - 2; cols++) {
                if (bestSum(inputMatrix, sum, rows, cols)){
                    sum = getSum(inputMatrix, sum, rows, cols);
                    rowPosition = rows;
                    colPosition = cols;
                    bestMatrix3X3 = getBestMatrix3X3(inputMatrix, rowPosition, colPosition);
                }
            }
        }
        System.out.println("Sum = " + sum);
        for (int rows = 0; rows < bestMatrix3X3.length; rows++) {
            for (int cols = 0; cols < bestMatrix3X3[rows].length; cols++) {
                System.out.print(bestMatrix3X3[rows][cols] + " ");
            }
            System.out.println();
        }

    }

    private static int[][] getBestMatrix3X3(int[][] inputMatrix, int rows, int cols) {
        int[][] bestMatrix3X3 = new int[3][3];

        for (int row = 0; row < bestMatrix3X3.length; row++) {
            for (int col = 0; col < bestMatrix3X3.length; col++) {
                bestMatrix3X3[row][col] = inputMatrix[rows + row][cols + col];
            }
        }

        return bestMatrix3X3;
    }

    private static int getSum(int[][] inputMatrix, int sum, int rows, int cols) {
        return sum = inputMatrix[rows][cols] + inputMatrix[rows][cols + 1] + inputMatrix[rows][cols + 2] +
                inputMatrix[rows + 1][cols] + inputMatrix[rows + 1][cols + 1] + inputMatrix[rows + 1][cols + 2] +
                inputMatrix[rows + 2][cols] + inputMatrix[rows + 2][cols + 1] + inputMatrix[rows + 2][cols + 2];
    }

    private static boolean bestSum(int[][] inputMatrix, int sum, int rows, int cols) {
        boolean found = false;
        if (sum < inputMatrix[rows][cols] + inputMatrix[rows][cols + 1] + inputMatrix[rows][cols + 2] +
                inputMatrix[rows + 1][cols] + inputMatrix[rows + 1][cols + 1] + inputMatrix[rows + 1][cols + 2] +
                inputMatrix[rows + 2][cols] + inputMatrix[rows + 2][cols + 1] + inputMatrix[rows + 2][cols + 2]){
            found = true;
        }
        return found;
    }

    private static int[][] readMatrix(Scanner scan, int row, int col) {
        int[][] matrix = new int[row][col];
        for (int rows = 0; rows < matrix.length; rows++) {
            int[] matrixLine = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[rows] = matrixLine;
        }
        return matrix;
    }
}
