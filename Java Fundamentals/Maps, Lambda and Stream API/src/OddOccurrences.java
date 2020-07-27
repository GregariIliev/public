import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] sequence = scan.nextLine().split("\\s+");

        Map<String, Integer> sequenceMap = new LinkedHashMap<>();

        for (int i = 0; i < sequence.length; i++) {
            String word  = sequence[i].toLowerCase();

            if (sequenceMap.containsKey(word)){
                sequenceMap.put(word, sequenceMap.get(word) + 1);
            }else {
                sequenceMap.put(word, 1);
            }

        }
        List<String> keys = new ArrayList<>();

        for (Map.Entry<String, Integer> entry: sequenceMap.entrySet()) {
            if (entry.getValue() % 2 == 1){
                keys.add(entry.getKey());
            }
        }

        System.out.println(keys.toString().replaceAll("[\\]\\[]",""));

    }
}
