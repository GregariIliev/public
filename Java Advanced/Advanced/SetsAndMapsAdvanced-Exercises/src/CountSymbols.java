import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Character, Integer> map = new TreeMap<>();

        String text = scan.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            int value = 0;
            map.putIfAbsent(symbol, value);
            map.put(symbol, map.get(symbol) + 1);
        }

        map.entrySet().stream().forEach(e -> {
            System.out.printf("%c: %d time/s%n",e.getKey(), e.getValue());
        });
    }
}
