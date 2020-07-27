import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int count = 0;
        int maxNumb = Integer.MIN_VALUE;
        while (count < n){
            int numb = Integer.parseInt(scan.nextLine());
            if (maxNumb < numb){
                maxNumb = numb;
            }
            count++;
        }
        System.out.println(maxNumb);
    }
}
