import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        System.out.println(vowelsCoun(text));
    }

    private static int vowelsCoun(String text) {
        int numbOfVowels = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol == 'e' || symbol == 'o' || symbol == 'u' || symbol == 'i' ||
                    symbol == 'A' || symbol == 'a' ||symbol == 'E' || symbol == 'O' || symbol == 'U' || symbol == 'I'){
                numbOfVowels ++;
            }
        }
        return numbOfVowels;
    }
}
