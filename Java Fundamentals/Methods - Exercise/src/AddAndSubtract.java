import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumb = Integer.parseInt(scan.nextLine());
        int secondNumb = Integer.parseInt(scan.nextLine());
        int thirdNumb = Integer.parseInt(scan.nextLine());

        sum(firstNumb, secondNumb);
        subtract(sum(firstNumb, secondNumb),thirdNumb);
        System.out.println(subtract(sum(firstNumb, secondNumb),thirdNumb));
    }

    private static int subtract(int sum, int thirdNumb) {
        return sum - thirdNumb;
    }

    private static int sum(int firstNumb, int secondNumb) {
        return firstNumb + secondNumb;
    }
}
