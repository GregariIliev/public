import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int spiceYield = Integer.parseInt(scan.nextLine());
        int days = 0;
        int totalYield = 0;
        int yieldConsumed = 0;
        while(spiceYield >= 100) {
            totalYield += spiceYield;
            spiceYield -= 10;
            days++;
            yieldConsumed += 26;
        }
        totalYield -= yieldConsumed;
        if (totalYield >= 26){
            totalYield -= 26;
        }
        System.out.println(days);
        System.out.println(totalYield);
    }
}
