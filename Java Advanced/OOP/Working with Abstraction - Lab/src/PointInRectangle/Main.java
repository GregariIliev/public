package PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] rectanglePoints = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Rectangle rectangle = new Rectangle(new Point(rectanglePoints[0], rectanglePoints[1]), new Point(rectanglePoints[2], rectanglePoints[3]));

        int pointsToCheck = Integer.parseInt(scan.nextLine());

        while (pointsToCheck-- > 0){
            int[] pointCoordinates = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            Point point = new Point(pointCoordinates[0], pointCoordinates[1]);

            System.out.println(rectangle.contains(point));
        }
    }
}
