import java.util.Scanner;

public class AreaFigure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String area = scan.nextLine();

        if (area.equals("square")) {
            double duljina = Double.parseDouble(scan.nextLine());
            double squareArea = duljina * duljina;
            System.out.printf("%.3f",squareArea);
        }else if (area.equals("rectangle")){
            double duljinaRectangle = Double.parseDouble(scan.nextLine());
            double duljinaRectangle2 = Double.parseDouble(scan.nextLine());
            double rectangleArea = duljinaRectangle * duljinaRectangle2;
            System.out.printf("%.3f",rectangleArea);
        }else if (area.equals("circle")){
            double radius = Double.parseDouble(scan.nextLine());
            double circleArea = (radius * radius) * Math.PI;
            System.out.printf("%.3f",circleArea);
        }else if (area.equals("triangle")){
            double duljinaTriangle = Double.parseDouble(scan.nextLine());
            double visochinaTriangle = Double.parseDouble(scan.nextLine());
            double triangleArea = (duljinaTriangle * visochinaTriangle) / 2;
            System.out.printf("%.3f",triangleArea);

        }
    }
}
