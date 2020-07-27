import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int result = 0;
        for (int i = 1 ; i <= a ; i++){
            int b = Integer.parseInt(scan.nextLine());
            result = result + b;
        }
        System.out.println(result);

    }
}
