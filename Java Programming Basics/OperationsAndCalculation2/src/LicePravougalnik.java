import java.util.Scanner;

public class LicePravougalnik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double absX = Math.abs(x1-x2);
        double absY = Math.abs(y1-y2);
        double area = absX*absY;
        double perimetar = 2 * (absX+absY);

        System.out.printf("%.2f%n",area);
        System.out.printf("%.2f",perimetar);
    }
}
