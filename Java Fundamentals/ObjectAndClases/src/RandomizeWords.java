import java.util.*;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        List<String> words = new ArrayList<>(Arrays.asList(input));

        Random rand = new Random();

        for (int i = 0; i < words.size(); i++) {

            int random = rand.nextInt(words.size());

            String wordToSwitch = words.get(i);
            words.set(i, words.get(random));
            words.set(random, wordToSwitch);

        }
        for (String wordsOutput :
                words) {
            System.out.println(wordsOutput);
        }
    }
}