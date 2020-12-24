package jediGalaxy;

public class Ivo {
    private int row;
    private int col;

    public int collectStars(Galaxy galaxy){

        int sum = 0;

        while (this.row >= 0 && this.col < galaxy.getMatrix()[1].length) {
            if (this.row >= 0 && this.row < galaxy.getMatrix().length && this.col >= 0 && this.col < galaxy.getMatrix()[0].length) {
                sum += galaxy.getMatrix()[this.row][this.col];
            }
            this.col++;
            this.row--;
        }
        return sum;
    }

    public void setNewCoordinates(int[] ivoCoordinates) {
        this.row = ivoCoordinates[0];
        this.col = ivoCoordinates[1];
    }
}
