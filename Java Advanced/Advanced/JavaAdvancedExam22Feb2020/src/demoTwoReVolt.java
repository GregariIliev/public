import java.util.Scanner;

public class demoTwoReVolt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int commandsCount = Integer.parseInt(sc.nextLine());
        int playerRow = -1;
        int playerCol = -1;
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            if (line.contains("f")){
                playerRow = i;
                playerCol = line.indexOf("f");
            }
            matrix[i] = line.toCharArray();
        }

        boolean winner = false;
        while (commandsCount-->0 && !winner){
            String command = sc.nextLine();
            switch (command){
                case "up":
                    matrix[playerRow][playerCol] = '-';
                    playerRow-=1;
                    playerRow =checkRow(matrix, playerRow);
                    if (matrix[playerRow][playerCol] == 'B'){
                        playerRow-=1;
                        playerRow =checkRow(matrix, playerRow);

                    }
                    if (matrix[playerRow][playerCol] == 'T'){
                        playerRow+=1;
                        matrix[playerRow][playerCol] = 'f';
                    }
                    if (matrix[playerRow][playerCol] == 'F'){
                        winner = true;
                        matrix[playerRow][playerCol] = 'f';
                        break;
                    }
                    matrix[playerRow][playerCol] = 'f';
                    break;
                case "down":
                    matrix[playerRow][playerCol] = '-';
                    playerRow+=1;
                    playerRow =checkRow(matrix, playerRow);
                    if (matrix[playerRow][playerCol] == 'B'){
                        playerRow+=1;
                        playerRow =checkRow(matrix, playerRow);
                    }
                    if (matrix[playerRow][playerCol] == 'T'){
                        playerRow-=1;
                        matrix[playerRow][playerCol] = 'f';
                    }if (matrix[playerRow][playerCol] == 'F'){
                    winner = true;
                    matrix[playerRow][playerCol] = 'f';
                    break;
                }
                    matrix[playerRow][playerCol] = 'f';
                    break;
                case "left":
                    matrix[playerRow][playerCol] = '-';
                    playerCol-=1;
                    playerCol = checkCol(matrix, playerCol);
                    if (matrix[playerRow][playerCol] == 'B'){
                        playerCol-=1;
                        playerCol = checkCol(matrix, playerCol);

                    }
                    if (matrix[playerRow][playerCol] == 'T'){
                        playerCol+=1;
                        matrix[playerRow][playerCol] = 'f';
                    }if (matrix[playerRow][playerCol] == 'F'){
                    winner = true;
                    matrix[playerRow][playerCol] = 'f';
                    break;
                }
                    matrix[playerRow][playerCol] = 'f';
                    break;
                case "right":
                    matrix[playerRow][playerCol] = '-';
                    playerCol+=1;
                    playerCol = checkCol(matrix, playerCol);
                    if (matrix[playerRow][playerCol] == 'B'){
                        playerCol+=1;
                        playerCol = checkCol(matrix, playerCol);
                    }
                    if (matrix[playerRow][playerCol] == 'T'){
                        playerCol-=1;
                        matrix[playerRow][playerCol] = 'f';
                    }if (matrix[playerRow][playerCol] == 'F'){
                    winner = true;
                    matrix[playerRow][playerCol] = 'f';
                    break;
                }
                    matrix[playerRow][playerCol] = 'f';
                    break;

            }
        }
        if (winner){
            System.out.println("Player won!");
        }else{
            System.out.println("Player lost!");
        }
        printMatrix(matrix);
    }

    private static int checkRow(char[][] matrix, int playerRow) {
        if (playerRow == matrix.length){
            playerRow = 0;
        }
        if (playerRow == -1){
            playerRow = matrix.length-1;
        }
        return playerRow;
    }
    private static int checkCol(char[][] matrix, int playerCol) {
        if (playerCol == matrix.length){
            playerCol = 0;
        }
        if (playerCol == -1){
            playerCol = matrix.length-1;
        }
        return playerCol;
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
}
