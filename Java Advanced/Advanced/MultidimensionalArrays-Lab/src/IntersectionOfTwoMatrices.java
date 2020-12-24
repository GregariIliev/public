import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());

        String[][] firstMatrix = readMatrix(scan, rows, new String[rows][cols]);
        String[][] secondMatrix = readMatrix(scan, rows, new String[rows][cols]);

        compareTwoMatrices(firstMatrix, secondMatrix);

    }

    private static void compareTwoMatrices(String[][] firstMatrix, String[][] secondMatrix) {
        for (int rows = 0; rows < firstMatrix.length; rows++) {
            for (int cols = 0; cols < firstMatrix[rows].length; cols++) {
                String firstMatrixSymbol = firstMatrix[rows][cols];
                String secondMatrixSymbol = secondMatrix[rows][cols];
                if (firstMatrixSymbol.equals(secondMatrixSymbol)){
                    System.out.print(firstMatrixSymbol + " ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    private static String[][] readMatrix(Scanner scan, int rows, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            String[] matrixLine = scan.nextLine().split("\\s+");
            matrix[row] = matrixLine;
        }
        return matrix;
    }
}
