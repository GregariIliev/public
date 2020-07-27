import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String  input = scan.nextLine();

        Map<String, Double> articlesPrice = new LinkedHashMap<>();
        Map<String, Integer> articlesQuantity = new LinkedHashMap<>();

        while (!"buy".equals(input)){
            String[] arrInput = input.split(" ");
            String product = arrInput[0];
            double price = Double.parseDouble(arrInput[1]);
            int quantity = Integer.parseInt(arrInput[2]);

            articlesPrice.putIfAbsent(product, 0.0);
            articlesQuantity.putIfAbsent(product, 0);

            articlesPrice.put(product, price);
            articlesQuantity.put(product, articlesQuantity.get(product) + quantity);

            input = scan.nextLine();

        }
        articlesPrice
                .entrySet()
                .stream()
                .forEach(a -> System.out.println(String.format("%s -> %.2f",a.getKey(), a.getValue() * articlesQuantity.get(a.getKey()))));
    }
}
