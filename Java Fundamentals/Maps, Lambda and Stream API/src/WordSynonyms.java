import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> synonyms = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String keyWord = scan.nextLine();
            String valueSynonym = scan.nextLine();

            synonyms.putIfAbsent(keyWord, new ArrayList<>());
            synonyms.get(keyWord).add(valueSynonym);
        }

        for (Map.Entry<String, List<String>> entry : synonyms.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(), entry.getValue().toString().replaceAll("[\\]\\[]", ""));
        }
    }
}
