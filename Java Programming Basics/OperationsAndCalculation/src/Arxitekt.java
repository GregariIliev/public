import java.util.Scanner;

public class Arxitekt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int proect = Integer.parseInt(scan.nextLine());
        int hours = proect * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",name ,hours, proect);
    }
}
