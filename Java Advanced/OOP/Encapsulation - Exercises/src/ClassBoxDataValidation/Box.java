public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) throws IllegalAccessException {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) throws IllegalAccessException {
        if (length > 0){
            this.length = length;
        }else {
            throw new IllegalAccessException("Length cannot be zero or negative.");
        }
    }

    private void setWidth(double width) throws IllegalAccessException {
        if (width > 0){
            this.width = width;
        }else {
            throw new IllegalAccessException("Width cannot be zero or negative.");
        }
    }

    private void setHeight(double height) throws IllegalAccessException {
        if (height > 0){
            this.height = height;
        }else {
            throw new IllegalAccessException("Height cannot be zero or negative.");
        }
    }

    public double calculateVolume(){
        return this.length * this.width * this.height;
    }

    public double calculateLateralSurfaceArea(){
        return (2 * this.length * this.height) + (2 * this.width * this.height);
    }

    public double calculateSurfaceArea(){
        return (2 * this.length * this.width) + calculateLateralSurfaceArea();
    }

}
