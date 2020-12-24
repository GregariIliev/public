import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] sizeAndPattern = scan.nextLine().split(", ");
        int size = Integer.parseInt(sizeAndPattern[0]);
        String pattern = sizeAndPattern[1];

        int numb = 1;

        int[][] matrix = new int[size][size];

        if ("A".equals(pattern)){
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    matrix[col][row] = numb++;
                }
            }


        }else if ("B".equals(pattern)){
            for (int col = 0; col < matrix.length; col++) {
                if (col % 2 == 0){
                    for (int row = 0; row < matrix[col].length; row++) {
                        matrix[row][col] = numb++;
                    }
                }else {
                    for (int row = matrix.length - 1; row >= 0; row--) {
                        matrix[row][col] = numb++;
                    }
                }
            }

        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
