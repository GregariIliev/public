import javax.swing.*;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static long[] memoryFibonacci;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        memoryFibonacci = new long[number + 1];
        System.out.println(getFibonacci(number));

    }

    private static long getFibonacci(int number) {

        if (number <= 1){
            return 1;
        }
        if (memoryFibonacci[number] != 0){
            return memoryFibonacci[number];
        }

        return memoryFibonacci[number] = getFibonacci(number - 1) + getFibonacci(number - 2);

    }
}
