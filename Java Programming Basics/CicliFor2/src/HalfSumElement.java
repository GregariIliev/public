import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int bigNumb = Integer.MIN_VALUE;
        for ( int i = 1; i <= a; i++){
            int b = Integer.parseInt(scan.nextLine());
            if (b >= bigNumb){
                bigNumb = b;
            }
            sum = sum + b;
        }
        int finSum = sum - bigNumb;
        int diff = bigNumb - finSum;
        if (finSum == bigNumb){
            System.out.println("Yes");
            System.out.println("Sum = " + finSum);
        }else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(diff));
        }
    }
}
