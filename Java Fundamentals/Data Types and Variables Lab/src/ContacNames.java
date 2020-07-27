import java.util.Scanner;

public class ContacNames {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String firstName = scan.nextLine();
        String secondName = scan.nextLine();
        String symbolDelimeter = scan.nextLine();

        System.out.printf("%s%s%s ", firstName, symbolDelimeter, secondName);
    }
}


