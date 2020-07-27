import java.util.Scanner;

public class newStipendii {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double doxod = Double.parseDouble(scan.nextLine());
        double uspex = Double.parseDouble(scan.nextLine());
        double zaplata = Double.parseDouble(scan.nextLine());

        double otlStipendia = 0.0;
        double socStipendia = 0.0;

        if (uspex >= 5.50){
            otlStipendia = uspex * 25;
        }
        if (doxod < zaplata && uspex > 4.50){
            socStipendia = zaplata * 0.35;
        }
        if (socStipendia == 0 && otlStipendia == 0){
            System.out.println("You cannot get a scholarship!");
        }else if (otlStipendia >= socStipendia) {
            System.out.printf("You get a scholarship from excellent results %.0f BGN", Math.floor(otlStipendia));
        }else if (socStipendia > otlStipendia){
            System.out.printf("You get a Social scholarship %.0f BGN",Math.floor(socStipendia));
        }
    }
}
