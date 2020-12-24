import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //You will be given an integer N representing the number of elements to enqueue (add),
        // an integer S representing the number of elements to dequeue (remove/poll) from the queue and
        // finally an integer X, an element that you should check whether is present in the queue.
        // If it is print true on the console, if it’s not print the smallest element currently present
        // in the queue.

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int n = scan.nextInt();
        int s = scan.nextInt();
        int x = scan.nextInt();

        scan.nextLine();

        int[] ints = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++) {
            queue.offer(ints[i]);
        }
        for (int i = 0; i < s; i++) {
            if (!queue.isEmpty()){
                queue.poll();
            }
        }

        if (!queue.isEmpty()){
            if (queue.contains(x)){
                System.out.println("true");
            }else {
                System.out.println(Collections.min(queue));
            }
        }else {
            System.out.println(0);
        }

    }
}
