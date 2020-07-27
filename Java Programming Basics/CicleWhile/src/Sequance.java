import java.util.Scanner;

public class Sequance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int numb = 1;
        while (numb <= n){
            System.out.println(numb);
            numb = 2 * numb + 1;
        }
    }
}
