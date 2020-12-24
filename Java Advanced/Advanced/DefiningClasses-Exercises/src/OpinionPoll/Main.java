package OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<String> line = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String inputLine = scan.nextLine();
            line.add(inputLine);
        }

        line.stream().sorted((l, r) -> l.compareTo(r)).filter(e -> {
            String[] split = e.split("\\s+");
            int age = Integer.parseInt(split[1]);
            return age > 30;
        }).forEach(a -> {
            String[] split = a.split("\\s+");
            System.out.println(split[0] + " - " + split[1]);
        });
    }
}
