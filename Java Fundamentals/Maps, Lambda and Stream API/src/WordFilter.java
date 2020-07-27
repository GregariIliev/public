import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        Arrays.stream(input).filter(a -> a.length() % 2 == 0).forEach(s -> System.out.println(s));

    }
}
