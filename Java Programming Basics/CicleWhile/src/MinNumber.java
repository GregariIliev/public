import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int count = 0;
        int minNumb = Integer.MAX_VALUE;
        while (count < n){
            int numb = Integer.parseInt(scan.nextLine());
            if (minNumb > numb){
                minNumb = numb;
            }
            count++;
        }
        System.out.println(minNumb);
    }
}
