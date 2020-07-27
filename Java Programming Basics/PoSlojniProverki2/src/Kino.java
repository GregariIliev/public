import java.sql.PreparedStatement;
import java.util.Scanner;

public class Kino {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String projection = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());

        double price = 0;
        if (projection.equals("Premiere")){
            price = rows * columns * 12.00;
        }else if (projection.equals("Normal")){
            price = rows * columns * 7.50;
        }else if (projection.equals("Discount")){
            price = rows * columns * 5.00;
        }
        System.out.printf("%.2f leva",price);
    }
}
