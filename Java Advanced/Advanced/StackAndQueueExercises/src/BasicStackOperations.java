import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] NSX = scan.nextLine().split("\\s+");
        int N = Integer.parseInt(NSX[0]);
        int S = Integer.parseInt(NSX[1]);
        int X = Integer.parseInt(NSX[2]);

        String[] inputStack = scan.nextLine().split("\\s+");
        ArrayDeque<Integer> stackNumbers = new ArrayDeque<>();

        pushInputToStack(inputStack, stackNumbers, N);
        popFromStack(stackNumbers, S);

        if (!stackNumbers.isEmpty()) {
            if (stackNumbers.contains(X)) {
                System.out.print("true");
            } else {
                System.out.print(Collections.min(stackNumbers));
            }
        }

    }

    private static void popFromStack(ArrayDeque<Integer> stackNumbers, int popTimes) {
        for (int i = 0; i < popTimes; i++) {
            if (!stackNumbers.isEmpty()) {
                stackNumbers.pop();
            } else {
                System.out.println(0);
            }
        }

    }

    private static void pushInputToStack(String[] input, ArrayDeque<Integer> stack, int pushTimes) {
        for (int i = 0; i < pushTimes; i++) {
            stack.push(Integer.parseInt(input[i]));
        }
    }
}
