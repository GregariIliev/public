import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numb = Integer.parseInt(scan.nextLine());

        printTriangle(numb);
    }

    private static void printTriangle(int numb) {
        printTopPartTriangle(numb);
        printBootPartTriangle(numb);
    }

    private static void printBootPartTriangle(int numb) {
        for (int i = numb; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printTopPartTriangle(int numb) {
        for (int i = 1; i <= numb; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
