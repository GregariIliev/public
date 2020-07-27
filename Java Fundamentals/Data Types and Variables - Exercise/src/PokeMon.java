import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());
        int count  = 0;
        int originalN = n;
        while (n >= m){
            count++;
            n = n - m;
            if (originalN / 2 == n && y > 0) {
                n = (int) n / y;
            }
        }
        System.out.println(n);
        System.out.println(count);
    }
}
