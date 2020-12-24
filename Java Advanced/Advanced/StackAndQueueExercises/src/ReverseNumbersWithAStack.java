import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputNumbers = scan.nextLine().split("\\s+");
        ArrayDeque<String> stackOfNumbers = new ArrayDeque<>();

        pushInputToStack(inputNumbers, stackOfNumbers);
        print(stackOfNumbers);

    }

    private static void print(ArrayDeque<String> stack) {
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }

    private static void pushInputToStack(String[] input, ArrayDeque<String> stack) {
        for (int i = 0; i < input.length; i++) {
            stack.push(input[i]);
        }
    }
}
