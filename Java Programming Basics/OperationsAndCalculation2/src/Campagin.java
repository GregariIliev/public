import java.util.Scanner;

public class Campagin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dni = Integer.parseInt(scan.nextLine());
        int sladkari = Integer.parseInt(scan.nextLine());
        int torti = Integer.parseInt(scan.nextLine());
        int gofreti = Integer.parseInt(scan.nextLine());
        int palachinki = Integer.parseInt(scan.nextLine());

        int toriLv = torti * 45;
        double gofretiLv = gofreti * 5.80;
        double palacinkiLv = palachinki * 3.20;
        double deserti = toriLv + gofretiLv + palacinkiLv;
        double desertiNaDen = deserti * sladkari;
        double desertiAll = desertiNaDen * dni;
        double chast = desertiAll / 8;
        double sabraniPari = desertiAll - chast;
        System.out.printf("%.2f",sabraniPari);

    }
}
