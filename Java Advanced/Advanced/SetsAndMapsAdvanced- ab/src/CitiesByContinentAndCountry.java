import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, ArrayList<String>>> shopInformation = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            if (!shopInformation.containsKey(continent)) {
                shopInformation.put(continent, new LinkedHashMap<>());
                shopInformation.get(continent).putIfAbsent(country, new ArrayList<>());
                shopInformation.get(continent).get(country).add(city);
            }else{
                shopInformation.get(continent).putIfAbsent(country, new ArrayList<>());
                shopInformation.get(continent).get(country).add(city);
            }


        }

        for (Map.Entry<String, Map<String, ArrayList<String>>> shopMap : shopInformation.entrySet()) {
            System.out.println(shopMap.getKey() + ":");

            shopMap.getValue().entrySet().stream().forEach(e -> {
                System.out.printf("  %s -> ",e.getKey());
                System.out.print(String.join(", ",e.getValue()));
                System.out.println();
            });
        }
    }
}
