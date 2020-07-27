import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int tankCapacity = 255;
        int tankOverflow = 0;
        for (int i = 1; i <= n; i++) {
            int liters = Integer.parseInt(scan.nextLine());
            if (tankCapacity >= tankOverflow + liters){
                tankOverflow += liters;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(tankOverflow);
    }
}
