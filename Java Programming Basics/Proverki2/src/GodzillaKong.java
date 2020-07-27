import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double biujet = Double.parseDouble(scan.nextLine());
        int statisti = Integer.parseInt(scan.nextLine());
        double cenaObleklo = Double.parseDouble(scan.nextLine());

        double dekor = biujet * 0.1;
        double oblekloPrice = statisti * cenaObleklo;
        if (statisti > 150){
            oblekloPrice = oblekloPrice * 0.9;
        }
        double allPrice = dekor + oblekloPrice;
        double moneyLeft = allPrice - biujet;
        if (allPrice > biujet){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",moneyLeft);
        }else {System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",Math.abs(moneyLeft));}
    }

}
