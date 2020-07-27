import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String biggerKegModel = "";
        double biggerKegVolume = 0;

        for (int j = 1; j <= n; j++) {
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            double kegVolume = Math.PI * (radius * radius) * height;
            if (kegVolume > biggerKegVolume){
                biggerKegVolume = kegVolume;
                biggerKegModel = model;
            }
        }
        System.out.println(biggerKegModel);
    }
}
