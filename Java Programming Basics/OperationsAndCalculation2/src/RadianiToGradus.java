import java.util.Scanner;

public class RadianiToGradus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ugal = Double.parseDouble(scan.nextLine());
        double radiani = ugal * 180 / Math.PI;
        System.out.printf("%.0f",radiani);
    }
}
