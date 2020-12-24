import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] tokens = scan.nextLine().split("[()]");
        String command   = tokens[0];
        int degrees = Integer.parseInt(tokens[1]) % 360;
        int bestSize = 0;

        List<String> lines = new ArrayList<>();

        String input = scan.nextLine();
        while (!"END".equals(input)){
            if (input.length() > bestSize){
                bestSize = input.length();
            }
            lines.add(input);
            input = scan.nextLine();
        }

        char[][] matrix = new char[lines.size()][bestSize];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (lines.get(row).length() > col){
                    matrix[row][col] = lines.get(row).charAt(col);
                }else {
                    matrix[row][col] = ' ';
                }
            }
        }
        if (command.equals("Rotate") && degrees == 90){
            print90Degrees(matrix);
        }else if (command.equals("Rotate") && degrees == 180){
            print180Degrees(matrix);
        }else if (command.equals("Rotate") && degrees == 270){
            print270Degrees(matrix);
        }else {
            print(matrix);
        }
    }

    private static void print(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void print270Degrees(char[][] matrix) {
        for (int col = matrix[0].length - 1; col >= 0; col--) {
            for (int row = 0; row < matrix.length; row++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void print180Degrees(char[][] matrix) {
        for (int row = matrix.length - 1; row >= 0; row--) {
            for (int col = matrix[row].length - 1; col >= 0; col--) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void print90Degrees(char[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = matrix.length - 1; row >= 0 ; row--) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
