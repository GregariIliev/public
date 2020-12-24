import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());

        int[][] matrix = readMatrix(scan, rows);

        int[] positionOfTheWrongValue = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rowPosition = positionOfTheWrongValue[0];
        int colPosition = positionOfTheWrongValue[1];

        int numberInWrongPosition = matrix[rowPosition][colPosition];

        int[][] reworkedMatrix = new int[matrix.length][];
        for (int row = 0; row < matrix.length; row++) {
            reworkedMatrix[row] = new int[matrix[row].length];
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == numberInWrongPosition){
                    int down = 0;
                    int up = 0;
                    int left = 0;
                    int right = 0;
                    if (row + 1 <= matrix.length - 1 && matrix[row + 1][col] != numberInWrongPosition){
                        down = matrix[row + 1][col];
                    }
                    if (row - 1 >= 0 && matrix[row - 1][col] != numberInWrongPosition){
                        up = matrix[row - 1][col];
                    }
                    if (col - 1 >= 0 && matrix[row][col - 1] != numberInWrongPosition){
                        left = matrix[row][col - 1];
                    }
                    if (col + 1 <= matrix[row].length - 1 && matrix[row][col + 1] != numberInWrongPosition){
                        right = matrix[row][col + 1];
                    }
                    reworkedMatrix[row][col] = down + up + left + right;
                }else {
                    reworkedMatrix[row][col] = matrix[row][col];
                }
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(reworkedMatrix[row][col] + " ");
            }
            System.out.println();
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
