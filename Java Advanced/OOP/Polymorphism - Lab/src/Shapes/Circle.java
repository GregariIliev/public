public class Circle extends Shape {
    private final Double radius;

    public Circle(Double radius){
        this.radius = radius;
    }

    public final Double getRadius() {
        return this.radius;
    }

    @Override
    protected Double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    protected Double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
