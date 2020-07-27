import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numb = Integer.parseInt(scan.nextLine());

        getSingOfNumber(numb);

        System.out.printf("The number %d is %s.",numb ,getSingOfNumber(numb));
    }

    private static String getSingOfNumber(int number) {
        String sing = "";
        if (number < 0){
            sing = "negative";
        }else if (number > 0){
            sing = "positive";
        }else {
            sing = "zero";
        }
        return sing;

    }
}
