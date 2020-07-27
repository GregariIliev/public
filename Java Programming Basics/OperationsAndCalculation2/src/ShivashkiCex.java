import java.util.Scanner;

public class ShivashkiCex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tables = Integer.parseInt(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double wight = Double.parseDouble(scan.nextLine());

        double pokrivka = tables *(length + 2*0.3) *(wight + 2*0.3);
        double USDp = pokrivka * 7;
        double kareta = length / 2;
        double karetaarea = kareta*kareta;
        double karetaAll = karetaarea * tables;
        double USDk = karetaAll * 9;
        double USD = USDk + USDp;
        double lv = USD * 1.85;


        System.out.printf("%.2f USD%n",USD);
        System.out.printf("%.2f BGN",lv);

    }
}
