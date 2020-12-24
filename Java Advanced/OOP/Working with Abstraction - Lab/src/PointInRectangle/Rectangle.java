package PointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;


    public Rectangle(Point bottomLeft, Point topRight){
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point){
        boolean inSiteRectangle = false;
        if (chekPointX(point) && chekPointY(point)){
            inSiteRectangle = true;
        }

        return inSiteRectangle;
    }

    private boolean chekPointY(Point point) {
        return point.getX() <= this.topRight.getX() && point.getY() <= this.topRight.getY();
    }

    private boolean chekPointX(Point point) {
        return point.getX() >= this.bottomLeft.getX() && point.getY() >= this.bottomLeft.getY();
    }
}
