import java.util.Scanner;

public class Alchohol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double cenawisky = Double.parseDouble(scan.nextLine());
        double biraLitri = Double.parseDouble(scan.nextLine());
        double vinoLitri = Double.parseDouble(scan.nextLine());
        double rakiaLitri = Double.parseDouble(scan.nextLine());
        double wiskyLitri = Double.parseDouble(scan.nextLine());

        double rakiaCena = cenawisky / 2;
        double vinoCena = rakiaCena * 0.6;
        double biraCena = rakiaCena * 0.2;

        double bira = biraLitri * biraCena;
        double vino = vinoCena * vinoLitri;
        double rakia = rakiaCena * rakiaLitri;
        double wisky = wiskyLitri * cenawisky;

        double pari = bira + vino + rakia + wisky;

        System.out.printf("%.2f",pari);


    }
}
