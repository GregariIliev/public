import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> stackNumbers = new ArrayDeque<>();

        int  n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String [] inputTokens = scan.nextLine().split("\\s+");
            String command = inputTokens[0];

            if (command.equals("1")){
                int numberX = Integer.parseInt(inputTokens[1]);
                stackNumbers.push(numberX);

            }else if (command.equals("2")){
                if (!stackNumbers.isEmpty()){
                    stackNumbers.pop();
                }

            }else if (command.equals("3")){
                System.out.println(stackNumbers.stream().mapToInt(Integer::intValue).max().orElse(0));

            }
        }

    }
}
