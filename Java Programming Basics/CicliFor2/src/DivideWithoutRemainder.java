import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        for (int i = 1; i <= a; i++){
            int b = Integer.parseInt(scan.nextLine());
            if (b % 2 == 0){
                p1++;
            }
            if (b % 3 == 0){
                p2++;
            }
            if (b % 4 == 0){
                p3++;
            }
        }
        double p1Percent = p1 / a * 100;
        double p2Percent = p2 / a * 100;
        double p3Percent = p3 / a * 100;
        System.out.printf("%.2f%%%n",p1Percent);
        System.out.printf("%.2f%%%n",p2Percent);
        System.out.printf("%.2f%%%n",p3Percent);
    }
}
