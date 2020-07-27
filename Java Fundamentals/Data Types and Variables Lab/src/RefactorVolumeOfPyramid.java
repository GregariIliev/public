import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double width = Double.parseDouble(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());

        double volume = (width * 1.0 * length * height) / 3.0;

        System.out.printf("Length: Width: Height: Pyramid Volume: %.2f",volume);
    }
}
