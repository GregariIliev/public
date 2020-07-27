import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String text = scan.nextLine();

        while (!"END".equals(text)){
            int number = Integer.parseInt(text);
            String palindrome = "";
            if (number > 0) {
                for (int i = text.length() - 1; i >= 0; i--) {
                palindrome += text.charAt(i);
                }
                if (text.equals(palindrome)){
                    System.out.println("true");
                }else {
                    System.out.println("false");
                }
            }
            text = scan.nextLine();
        }
    }
}
