import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String pass = scan.nextLine();

        String password = scan.nextLine();
        while (!pass.equals(password)){
            password = scan.nextLine();
        }
        System.out.printf("Welcome %s!",name);
    }
}
