import java.util.Arrays;
import java.util.Scanner;

public class PrintOfDiagonalSquareMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sizeMatrix = Integer.parseInt(scan.nextLine());

        int[][] matrix = readMatrix(scan, sizeMatrix);

        printDiagonals(matrix);


    }

    private static void printDiagonals(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col){
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
        System.out.println();
        int cols = 0;
        for (int row = matrix.length - 1; row >= 0; row--) {
            for (int col = cols; col < matrix[row].length;) {
                System.out.print(matrix[row][col] + " ");
                cols++;
                break;
            }
        }
    }

    private static int[][] readMatrix(Scanner scan, int rows) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            int[] matrixLine = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = matrixLine;
        }
        return matrix;
    }
}
