import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wagons = Integer.parseInt(scan.nextLine());
        int[] train = new int[wagons];
        int sum = 0;
        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scan.nextLine());
            sum += train[i];
        }
        for (int value : train) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println(sum);

    }
}
