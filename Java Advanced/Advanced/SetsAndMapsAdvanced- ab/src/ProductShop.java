import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, Double>> shopInformation = new TreeMap<>();

        String input = scan.nextLine();
        while (!"Revision".equals(input)) {
            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            if (!shopInformation.containsKey(shop)) {
                shopInformation.put(shop, new LinkedHashMap<>());
                shopInformation.get(shop).putIfAbsent(product, price);
            }

            shopInformation.get(shop).put(product, price);

            input = scan.nextLine();
        }

        for (Map.Entry<String, Map<String, Double>> shopMap : shopInformation.entrySet()) {
            System.out.println(shopMap.getKey() + "->");
            shopMap.getValue().entrySet().stream().forEach(e -> System.out.printf("Product: %s, Price: %.1f%n",e.getKey(), e.getValue()));
        }
    }
}
