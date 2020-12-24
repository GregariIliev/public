import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String file = scan.nextLine();

        while (!file.equals("print")){
            if (file.equals("cancel")){
                if (queue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.println("Canceled " + queue.pollFirst());
                }

            }else {
                queue.offer(file);
            }
            file = scan.nextLine();
        }

        while (!queue.isEmpty()){
            System.out.println(queue.pollFirst());
        }
    }
}
