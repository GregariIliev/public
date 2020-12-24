import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Scheduling {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] tasks = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] threads = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stackTasks = fillTasks(tasks);
        ArrayDeque<Integer> queueThreads = fillThreads(threads);

        int taskToKill = Integer.parseInt(scan.nextLine());

        boolean isKilled = false;
        int threadKillTask = 0;

        while (!stackTasks.isEmpty() && !queueThreads.isEmpty()){

            if (stackTasks.peek() == taskToKill){
                isKilled = true;
                threadKillTask = queueThreads.peek();
                break;
            }

            if (queueThreads.peek() >= stackTasks.peek()){
                queueThreads.poll();
                stackTasks.pop();
            }else {
                queueThreads.poll();
            }
        }

        if (isKilled){
            System.out.printf("Thread with value %d killed task %d%n", threadKillTask, taskToKill);
            for (Integer queueThread : queueThreads) {
                System.out.print(queueThread + " ");
            }
        }
    }

    private static ArrayDeque<Integer> fillThreads(int[] threads) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < threads.length; i++) {
            queue.offer(threads[i]);
        }
        return queue;
    }

    private static ArrayDeque<Integer> fillTasks(int[] tasks) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < tasks.length; i++) {
            stack.push(tasks[i]);
        }
        return stack;
    }
}
