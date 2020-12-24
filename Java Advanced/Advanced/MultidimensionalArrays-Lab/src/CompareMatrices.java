import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] firstMatrixSize = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rowsForFirstMatrix = firstMatrixSize[0];
        int colsForFirstMatrix = firstMatrixSize[1];
        String[][] firstMatrix = new String[rowsForFirstMatrix][colsForFirstMatrix];

        scanMatrix(scan, rowsForFirstMatrix, firstMatrix);

        int[] secondMatrixSize = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rowsForSecondMatrix = secondMatrixSize[0];
        int colsForSecondMatrix = secondMatrixSize[1];
        String[][] secondMatrix = new String[rowsForSecondMatrix][colsForSecondMatrix];

        scanMatrix(scan, rowsForSecondMatrix, secondMatrix);

        if (rowsForFirstMatrix == rowsForSecondMatrix && colsForFirstMatrix == colsForSecondMatrix){
            if (compareMatrices(firstMatrix, secondMatrix)){
                System.out.println("equal");
            }else {
                System.out.println("not equal");
            }
        }else {
            System.out.println("not equal");
        }

    }

    private static boolean compareMatrices(String[][] firstMatrix, String[][] secondMatrix) {
        boolean equal = true;
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                String firstMatrixNumber = firstMatrix[row][col];
                String secondMatrixNumber = secondMatrix[row][col];

                if (!firstMatrixNumber.equals(secondMatrixNumber)){
                    equal = false;
                    break;
                }
            }
        }
        return equal;
    }

    private static void scanMatrix(Scanner scan, int rows, String[][] firstMatrix) {
        for (int i = 0; i < rows; i++) {
            String[] lineMatrix = scan.nextLine().split("\\s+");
            firstMatrix[i] = lineMatrix;
        }
    }

    private static void printMatrix(String[][] firstMatrix) {
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                System.out.print(firstMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
