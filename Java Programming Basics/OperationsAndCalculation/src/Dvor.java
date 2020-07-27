import java.util.Scanner;

public class Dvor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kvMetri = Double.parseDouble(scan.nextLine());
        double cena = kvMetri * 7.61;
        double discount = cena * 0.18;
        double fcena = cena-discount;
        System.out.printf("The final price is: %.2f lv.%n",fcena);
        System.out.printf("The discount is: %.2f lv.",discount);
    }
}
