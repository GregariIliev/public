package jediGalaxy;

public class Galaxy {
    private int[][] matrix;

    public Galaxy(int[] coordinates){
        this.matrix = new int[coordinates[0]][coordinates[1]];
        fillGalaxy();
    }

    private void fillGalaxy(){
        int value = 0;
        for (int row = 0; row < this.matrix.length; row++) {
            for (int col = 0; col < this.matrix[row].length; col++) {
                this.matrix[row][col] = value++;
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    @Override
    public String toString(){
        StringBuilder galaxyPrint = new StringBuilder();

        for (int row = 0; row < this.matrix.length; row++) {
            for (int col = 0; col < this.matrix[row].length; col++) {
                galaxyPrint.append(this.matrix[row][col]).append(" ");
            }
            galaxyPrint.append(System.lineSeparator());
        }
        return galaxyPrint.toString();
    }
}
