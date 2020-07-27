import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());

        rectangleArea(width ,length);
        System.out.println(rectangleArea(width , length));
    }

    private static int rectangleArea(int width, int length) {
        int result = width * length;
        return result;
    }
}

