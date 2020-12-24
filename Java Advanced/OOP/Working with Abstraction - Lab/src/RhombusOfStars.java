import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());

        printTopHalfRhombus(size);
        printBottomHalfRhombus(size);

    }

    private static void printTopHalfRhombus(int size) {
        for (int i = 1; i <= size; i++) {
            printSymbol(size - i, " ");
            printSymbol(i, "* ");
            System.out.println();
        }
    }

    private static void printBottomHalfRhombus(int size) {
        for (int i = 1; i <= size; i++) {
            printSymbol(i, " ");
            printSymbol(size - i, "* ");
            System.out.println();
        }
    }

    private static void printSymbol(int size, String symbol) {
        for (int j = 0; j < size; j++) {
            System.out.print(symbol);
        }
    }
}
