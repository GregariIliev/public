public abstract class Shape {
    private final Double perimeter;
    private final Double area;

    protected Shape(){
        this.perimeter = calculatePerimeter();
        this.area = calculateArea();
    }

    protected abstract Double calculatePerimeter();
    protected abstract Double calculateArea();

    public Double getPerimeter() {
        return perimeter;
    }

    public Double getArea() {
        return area;
    }
}
