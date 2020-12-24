import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        ArrayDeque<String> deque = new ArrayDeque<>();

        boolean isBalanced = true;
        int lastPosition = 0;

        for (int i = 0; i < input.length(); i++) {
            char symbol =    input.charAt(i);
            lastPosition++;

            if (symbol == '(' || symbol == '[' || symbol == '{'){
                deque.push(String.valueOf(symbol));
            }else if (symbol == ')' || symbol == ']' || symbol == '}'){
                String character = deque.peek();
                if (!deque.isEmpty()){
                    if (character.equals("(") && symbol == ')'){
                        deque.pop();

                    }else if (character.equals("[") && symbol == ']'){
                        deque.pop();

                    }else if (character.equals("{") && symbol == '}'){
                        deque.pop();

                    }else {
                        isBalanced = false;
                        break;
                    }
                }else {
                    isBalanced = false;
                }
            }
        }
        if (!deque.isEmpty()){
            isBalanced = false;
        }

        if (isBalanced){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }

    private static void offerToQueue(ArrayDeque<String> queue, String secondPart) {
        for (int i = 0; i < secondPart.length(); i++) {
            char symbol = secondPart.charAt(i);
            queue.offer(String.valueOf(symbol));
        }
    }

    private static void putOnDeque(ArrayDeque<String> deque, String input) {
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            deque.push(String.valueOf(symbol));
        }
    }
}
