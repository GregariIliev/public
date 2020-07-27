import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        System.out.println(printMiddleCharacters(text));
    }

    private static String printMiddleCharacters(String text) {
        String result = "";
        if (text.length() % 2 == 0){
            result += text.charAt(text.length() / 2 - 1);
            result += text.charAt(text.length() / 2);
        }else if (text.length() % 2 == 1){
            result += text.charAt(text.length() / 2);
        }
        return result;
    }
}
