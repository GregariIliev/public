import java.util.Scanner;

public class Exellent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double otcenka = Double.parseDouble(scan.nextLine());
        if (otcenka>=5.50){
            System.out.println("Excellent!");
        }
    }
}
