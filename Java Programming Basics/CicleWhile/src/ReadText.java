import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        while (!"Stop".equals(a)){
            a = scan.nextLine();
        }
    }
}
