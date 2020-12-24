import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        int passing = Integer.parseInt(scan.nextLine());

        ArrayDeque<String> names = new ArrayDeque<>();
        Collections.addAll(names, input);
        int cycle = 1;

        while (names.size() > 1) {
            for (int i = 1; i <= passing; i++) {
                if (i == passing && isPrime(cycle)){
                    System.out.println("Prime " + names.peek());
                }else if (i == passing && !isPrime(cycle)){
                    System.out.println("Removed " + names.poll());
                }else if (!names.isEmpty()){
                    String name = names.poll();
                    names.offer(name);
                }
            }
            cycle++;
        }
        if (names.size() == 1) {
            System.out.println("Last is " + names.pollFirst());
        }

    }

    private static boolean isPrime(int cycle) {
        boolean isPrime = true;
        if (cycle == 0 || cycle == 1){
            return false;
        }
        for (int j = 2; j < cycle; j++) {
            if ( cycle % j == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
