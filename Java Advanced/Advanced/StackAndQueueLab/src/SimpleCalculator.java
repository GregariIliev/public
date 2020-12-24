import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputLine = scan.nextLine().split("\\s+");
        int sum = 0;
        ArrayDeque<String> calculatorStack = new ArrayDeque<>();

        pushToStack(inputLine, calculatorStack);
        while (!calculatorStack.isEmpty()){
            if (calculatorStack.peek().equals("-")){
                calculatorStack.pop();
                sum -= Integer.parseInt(calculatorStack.pop());
            }else if (calculatorStack.peek().equals("+")){
                calculatorStack.pop();
                sum += Integer.parseInt(calculatorStack.pop());
            }else {
                sum += Integer.parseInt(calculatorStack.pop());
            }
        }

        System.out.println(sum);
    }

    private static void pushToStack(String[] inputLine, ArrayDeque<String> calculatorStack) {
        for (int i = inputLine.length - 1; i >= 0 ; i--) {
            calculatorStack.push(inputLine[i]);
        }
    }
}
