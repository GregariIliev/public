package jediGalaxy;

public class Evil {
    private int row;
    private int col;

    public void destroyStars(Galaxy galaxy) {

        while (this.row >= 0 && this.col >= 0) {
            if (this.row >= 0 && this.row < galaxy.getMatrix().length && this.col >= 0 && this.col < galaxy.getMatrix()[0].length) {
                galaxy.getMatrix()[this.row][this.col] = 0;
            }
            this.row--;
            this.col--;
        }
    }

    public void setNewCoordinates(int[] evilCoordinates) {
        this.row = evilCoordinates[0];
        this.col = evilCoordinates[1];
    }
}
