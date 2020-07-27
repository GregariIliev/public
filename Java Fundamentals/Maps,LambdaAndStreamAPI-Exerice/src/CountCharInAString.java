import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        String text = "";
        for (int i = 0; i < input.length; i++) {
            text = text + input[i];
        }

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char key = text.charAt(i);

            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }else {
                map.put(key, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.printf("%c -> %s%n",entry.getKey(), entry.getValue());
        }
    }
}
