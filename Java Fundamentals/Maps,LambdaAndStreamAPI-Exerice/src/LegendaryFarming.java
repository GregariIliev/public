import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> legendaryMaterials = new LinkedHashMap<>();

        legendaryMaterials.put("shards", 0);
        legendaryMaterials.put("fragments", 0);
        legendaryMaterials.put("motes", 0);

        Map<String, Integer> junkMaterials = new LinkedHashMap<>();

        boolean isObtained = false;

        while (!isObtained) {

            String[] input = scan.nextLine().toLowerCase().split("\\s+");

            for (int i = 0; i < input.length; i += 2) {
                int value = Integer.parseInt(input[i]);
                String material = input[i + 1];

                if (legendaryMaterials.containsKey(material)) {

                    mapAdd(legendaryMaterials, material, value);

                    isObtained = isObtained(legendaryMaterials, material);

                    if (isObtained){
                        break;
                    }
                } else {
                    mapAdd(junkMaterials, material, value);
                }
            }
        }
        legendaryMaterials
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int result = b.getValue().compareTo(a.getValue());
                    if (result == 0){
                        result = a.getKey().compareTo(b.getKey());
                    }
                    return result;
                })
                .forEach(a -> System.out.printf("%s: %d%n",a.getKey(), a.getValue()));

        junkMaterials
                .entrySet()
                .stream()
                .sorted((a, b) -> a.getKey().compareTo(b.getKey()))
                .forEach(a -> System.out.printf("%s: %d%n",a.getKey(), a.getValue()));

    }

    private static void mapAdd(Map<String, Integer> map, String material, int value) {
        map.putIfAbsent(material, 0);
        map.put(material, map.get(material) + value);
    }

    private static boolean isObtained(Map<String, Integer> legendaryMaterials, String material) {
        if (legendaryMaterials.get(material) >= 250){
            switch (material) {
                case "shards":
                    System.out.println("Shadowmourne obtained!");
                    break;
                case "fragments":
                    System.out.println("Valanyr obtained!");
                    break;
                case "motes":
                    System.out.println("Dragonwrath obtained!");
                    break;
            }
            legendaryMaterials.put(material, legendaryMaterials.get(material) - 250);
            return true;
        }
        return false;
    }
}
