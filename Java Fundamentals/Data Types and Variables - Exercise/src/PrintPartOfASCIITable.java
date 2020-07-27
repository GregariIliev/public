import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumb = Integer.parseInt(scan.nextLine());
        int secondNumb = Integer.parseInt(scan.nextLine());

        for (int i = firstNumb; i <= secondNumb ; i++) {
            System.out.printf("%c ",i);
        }
    }
}
