import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String expression = scan.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char symbol  = expression.charAt(i);

            if (symbol == '('){
                stack.push(i);
            }else if (symbol == ')'){
                String toPrint = expression.substring(stack.pop(), i + 1);
                System.out.println(toPrint);
            }
        }
    }
}
