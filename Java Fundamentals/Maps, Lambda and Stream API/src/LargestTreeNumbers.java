import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LargestTreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] s = scan.nextLine().split("\\s+");

        List<Integer> numbList = new ArrayList<>();




        for (int i = 0; i < s.length; i++) {
            numbList.add(Integer.parseInt(s[i]));
        }

        numbList.stream().sorted((l, r) -> r.compareTo(l)).limit(3).forEach(c -> System.out.print(c + " "));
    }
}
