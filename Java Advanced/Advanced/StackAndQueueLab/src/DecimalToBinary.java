import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> binary = new ArrayDeque<>();

        int num = Integer.parseInt(scan.nextLine());
        if (num == 0){
            System.out.println(0);
        }
        pushBinaryCode(binary, num);
        printBinaryCode(binary);
    }

    private static void printBinaryCode(ArrayDeque<Integer> binary) {
        while (!binary.isEmpty()){
            System.out.print(binary.pop());
        }
    }

    private static void pushBinaryCode(ArrayDeque<Integer> binary, int num) {
        while (num != 0){
            binary.push(num % 2);
            num /= 2;
        }
    }
}
