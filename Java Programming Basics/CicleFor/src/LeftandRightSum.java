import java.util.Scanner;

public class LeftandRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= a; i++){
            int b = Integer.parseInt(scan.nextLine());
            leftSum = leftSum + b;
        }
        for (int i = 1; i <= a; i++){
            int b = Integer.parseInt(scan.nextLine());
            rightSum = rightSum + b;
        }
        int diff = leftSum - rightSum;
        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d",leftSum);
        }else {
            System.out.printf("No, diff = %d",Math.abs(diff));
        }
    }
}
