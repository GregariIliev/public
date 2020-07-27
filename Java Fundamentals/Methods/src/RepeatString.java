import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int numb = Integer.parseInt(scan.nextLine());

        newString(text ,numb);
        System.out.println(newString(text , numb));
    }

    private static String newString(String text, int numb) {
        String result = "";
        for (int i = 0; i < numb; i++) {
            result = result + text;
        }
        return result;
    }
}
