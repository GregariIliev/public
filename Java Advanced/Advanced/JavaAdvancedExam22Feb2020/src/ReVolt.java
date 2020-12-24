import java.util.Scanner;

public class ReVolt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sizeMatrix = Integer.parseInt(scan.nextLine());
        int countCommand = Integer.parseInt(scan.nextLine());

        char[][] matrix = new char[sizeMatrix][sizeMatrix];

        for (int i = 0; i < sizeMatrix; i++) {
            char[] lineMatrix = scan.nextLine().toCharArray();
            matrix[i] = lineMatrix;
        }

        int[] playerPosition = getPlayerPosition(matrix);
        int playerRow = playerPosition[0];
        int playerCol = playerPosition[1];

        char currentPosition = matrix[playerRow][playerCol];

        int[] finishPosition = getFinishPosition(matrix);

        while (countCommand-- > 0) {

            String command = scan.nextLine();

            if ("down".equals(command)) {
                matrix[playerRow][playerCol] = '-';
                playerRow = playerRow + 1;
                playerRow = checkRow(matrix, playerRow);

                if (matrix[playerRow][playerCol] == 'B'){
                    playerRow = playerRow + 1;
                    playerRow = checkRow(matrix, playerRow);
                }else if (matrix[playerRow][playerCol] == 'T'){
                    playerRow = playerRow - 1;
                    matrix[playerRow][playerCol] = 'f';
                }


            } else if ("up".equals(command)) {


            } else if ("left".equals(command)) {


            } else if ("right".equals(command)) {


            }
            if (playerPosition[0] == finishPosition[0] && playerPosition[1] == finishPosition[1]) {
                System.out.println("Player won!");
                printMatrix(matrix);
                break;
            }
        }

        if (countCommand <= 0) {
            System.out.println("Player lost!");
            printMatrix(matrix);
        }


    }

    private static int checkRow(char[][] matrix, int playerRow) {
        if (playerRow == matrix.length){
            playerRow = 0;
        }
        if (playerRow == -1){
            playerRow = matrix.length;
        }
        return playerRow;
    }

    private static int getPlayerRow(char[][] matrix, int playerRow) {
        if (playerRow == matrix.length) {
            playerRow = 0;
        }
        return playerRow;
    }


    private static int[] getPlayerPosition(char[][] matrix) {
        int[] playerPosition = new int[2];
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                char item = matrix[rows][cols];
                if (item == 'f') {
                    playerPosition[0] = rows;
                    playerPosition[1] = cols;
                }
            }
        }
        return playerPosition;
    }

    private static int[] getFinishPosition(char[][] matrix) {
        int[] finishPosition = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                char item = matrix[row][col];
                if (item == 'F') {
                    finishPosition[0] = row;
                    finishPosition[1] = col;
                }
            }
        }
        return finishPosition;
    }

    private static void printMatrix(char[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                System.out.print(matrix[rows][cols]);
            }
            System.out.println();
        }
    }
}
