import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashSet<Integer> firstDeque = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> secondDeque = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int round = 50;
        while (round-- > 0 && !firstDeque.isEmpty() && !secondDeque.isEmpty()){
            int firstCardPlayer = firstDeque.iterator().next();
            firstDeque.remove(firstCardPlayer);

            int secondCardPlayer = secondDeque.iterator().next();
            secondDeque.remove(secondCardPlayer);

            if (firstCardPlayer > secondCardPlayer){
                firstDeque.add(firstCardPlayer);
                firstDeque.add(secondCardPlayer);

            }else if (secondCardPlayer > firstCardPlayer){
                secondDeque.add(firstCardPlayer);
                secondDeque.add(secondCardPlayer);
            }
        }
        if (firstDeque.size() < secondDeque.size()){
            System.out.println("Second player win!");
        }else if (secondDeque.size() < firstDeque.size()){
            System.out.println("First player win!");
        }else {
            System.out.println("Draw!");
        }

    }
}
