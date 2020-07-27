import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(" ");
        for (int i = 0; i < line.length / 2; i++) {
            String latter = line[i];
            line[i] = line[line.length - 1 - i];
            line[line.length - 1 - i] = latter;

        }
        System.out.println(String.join(" ", line));

    }
}
