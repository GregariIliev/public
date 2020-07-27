import java.util.Scanner;

public class CharacterInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);

        characterRange(first, second);
    }

    private static void characterRange(char first, char second) {
        if (first > second){
            for (int i = second + 1; i < first; i++) {
                char b = (char) i;
                System.out.print(b + " ");
            }
        }
        for (int i = first + 1; i < second; i++) {
            char b = (char) i;
            System.out.print(b + " ");
        }

    }
}
