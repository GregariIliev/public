import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] phrases = new String[]{
                "Excellent product.","Such a great product.","I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."
        };
        String[] events = new String[] {
                "Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"
        };
        String[] authors = new String[] {
                "Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"
        };
        String[] cities = new String[] {
                "Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"
        };

        Random random = new Random();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            // List<String> finalAdMessage = new ArrayList<>();

            String wordPhrase = phrases[random.nextInt(phrases.length - 1)];
            String wordEvent = events[random.nextInt(phrases.length - 1)];
            String wordAuthor = authors[random.nextInt(phrases.length - 1)];
            String wordCities = cities[random.nextInt(phrases.length - 1)];

            System.out.printf("%s %s %s - %s%n", wordPhrase, wordEvent, wordAuthor, wordCities);
        }
    }
}

