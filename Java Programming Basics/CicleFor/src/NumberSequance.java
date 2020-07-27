import java.util.Scanner;

public class NumberSequance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int maxNumb = Integer.MIN_VALUE;
        int minNumb = Integer.MAX_VALUE;
        for (int a = 1 ; a <= n ; a++){
            int b = Integer.parseInt(scan.nextLine());
            if(b > maxNumb){
                maxNumb = b;
            }
            if (b < minNumb){
                minNumb = b;
            }

        }
        System.out.printf("Max number: %d%n",maxNumb);
        System.out.printf("Min number: %d",minNumb);
    }
}
