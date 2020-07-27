import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstChar = scan.nextLine();
        if (firstChar.equals(firstChar.toUpperCase())){
            System.out.println("upper-case");
        }else if (firstChar.equals(firstChar.toLowerCase())){
            System.out.println("lower-case");
        }
    }
}
