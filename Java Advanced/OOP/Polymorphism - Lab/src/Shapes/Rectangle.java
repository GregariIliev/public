public class Rectangle extends Shape {
    private final Double height;
    private final Double width;

    public Rectangle(Double height, Double width){
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return this.height;
    }

    public Double getWidth() {
        return this.width;
    }

    @Override
    protected Double calculatePerimeter() {

        return 2 * height + 2 * width;
    }

    @Override
    protected Double calculateArea() {

        return height * width;
    }
}
