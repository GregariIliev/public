import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        for (int i = 1; i <= a; i++){
            int b = Integer.parseInt(scan.nextLine());
            if (b < 200){
                p1 = p1 + 1;
            }else if (b < 400){
                p2 = p2 + 1;
            }else if (b < 600){
                p3 = p3 + 1;
            }else if (b < 800){
                p4 = p4 + 1;
            }else if (b <= 1000){
                p5 = p5 + 1;
            }
        }
        double p1Porcent = p1 / a * 100;
        double p2Porcent = p2 / a * 100;
        double p3Porcent = p3 / a * 100;
        double p4Porcent = p4 / a * 100;
        double p5Porcent = p5 / a * 100;
        System.out.printf("%.2f%%%n",p1Porcent);
        System.out.printf("%.2f%%%n",p2Porcent);
        System.out.printf("%.2f%%%n",p3Porcent);
        System.out.printf("%.2f%%%n",p4Porcent);
        System.out.printf("%.2f%%%n",p5Porcent);
    }
}
