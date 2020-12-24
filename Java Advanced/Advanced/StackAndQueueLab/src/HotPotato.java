import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        int passing = Integer.parseInt(scan.nextLine());

        ArrayDeque<String> names = new ArrayDeque<>();
        Collections.addAll(names, input);

        while (!names.isEmpty()){
            if (names.size() > 1){
                for (int i = 1; i <= passing; i++) {
                    if (i == passing){
                        System.out.println("Removed " + names.pollFirst());
                    }else {
                        String getName = names.pollFirst();
                        names.offer(getName);
                    }
                }
            }else if (names.size() == 1){
                System.out.println("Last is " + names.pollFirst());
            }
        }
    }
}
