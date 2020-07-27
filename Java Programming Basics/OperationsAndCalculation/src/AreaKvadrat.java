import java.util.Scanner;

public class AreaKvadrat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int area = a * a;
        System.out.println(area);
    }
}
