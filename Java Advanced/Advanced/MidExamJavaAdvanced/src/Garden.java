import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Garden {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] size = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[][] matrix = fillMatrix(size);;

        List<int[]> listFlower = new ArrayList<>();

        String input = scan.nextLine();
        while (!input.equals("Bloom Bloom Plow")){
            int[] rowCol = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int row = rowCol[0];
            int col = rowCol[1];

            if (row < 0 || row > matrix.length || col < 0 || col > matrix[row].length){
                System.out.println("Invalid coordinates.");
                continue;
            }
            listFlower.add(rowCol);
            input = scan.nextLine();
        }

        for (int i = 0; i < listFlower.size(); i++) {
            int rowFlowerPosition = listFlower.get(i)[0];
            int colFlowerPosition = listFlower.get(i)[1];

            matrix[rowFlowerPosition][colFlowerPosition] += 1;

            for (int col = 0; col < colFlowerPosition; col++) {
                matrix[rowFlowerPosition][col] += 1;
            }
            for (int col2 = colFlowerPosition + 1; col2 < matrix[rowFlowerPosition].length; col2++) {
                matrix[rowFlowerPosition][col2] += 1;
            }
            for (int row = 0; row < rowFlowerPosition; row++) {
                matrix[row][colFlowerPosition] += 1;
            }
            for (int row2 = rowFlowerPosition + 1; row2 < matrix.length; row2++) {
                matrix[row2][colFlowerPosition] += 1;
            }

        }
        printMatrix(matrix);

    }

    private static void printMatrix(int[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fillMatrix(int[] size) {
        int[][] matrix = new int[size[0]][size[1]];

        for (int rows = 0; rows < matrix.length; rows++) {
            Arrays.fill(matrix[rows], 0);
        }
        return matrix;
    }
}
