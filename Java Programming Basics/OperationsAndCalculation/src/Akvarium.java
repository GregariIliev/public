import java.util.Scanner;

public class Akvarium {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        int obem = length*width*height;
        double obemLitri = obem * 0.001;
        double procenti = percent*0.01;
        double fobem = obemLitri - (obemLitri * procenti);



        System.out.printf("%.3f",fobem);
    }
}
