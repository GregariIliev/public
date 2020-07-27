import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int VowelsChar = 0;
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            switch (a) {
                case 'a':
                    VowelsChar = VowelsChar + 1;
                    break;
                case 'e':
                    VowelsChar = VowelsChar + 2;
                    break;
                case 'i':
                    VowelsChar = VowelsChar + 3;
                    break;
                case 'o':
                    VowelsChar = VowelsChar + 4;
                    break;
                case 'u':
                    VowelsChar = VowelsChar + 5;
                    break;
            }

        }
        System.out.println(VowelsChar);
    }
}
