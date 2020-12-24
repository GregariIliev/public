import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            String name = scan.nextLine();
            int age = Integer.parseInt(scan.nextLine());

            Chicken chicken = new Chicken(name, age);
            System.out.println(chicken.toString());

        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
