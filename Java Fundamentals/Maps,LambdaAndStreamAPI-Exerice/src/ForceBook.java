import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> registerForce = new TreeMap<>();

        String input = scan.nextLine();
        while (!"Lumpawaroo".equals(input)) {
            if (input.contains("|")) {
                String[] inputData = input.split("\\s+\\|\\s+");
                String side = inputData[0];
                String name = inputData[1];
                boolean contains = false;
                for (Map.Entry<String, List<String>> entry : registerForce.entrySet()) {
                    if (entry.getValue().contains(name)) {
                        contains = true;
                        break;
                    }
                }

                if (!contains) {
                    if (!registerForce.containsKey(side)){
                        registerForce.put(side, new ArrayList<>());
                        registerForce.get(side).add(name);
                    }else if (registerForce.containsKey(side) && !registerForce.get(side).contains(name)){
                        registerForce.get(side).add(name);
                    }

                }
            } else if (input.contains("->")) {
                String[] inputData2 = input.split("\\s+->\\s+");
                String side2 = inputData2[1];
                String name2 = inputData2[0];

                for (Map.Entry<String, List<String>> entry : registerForce.entrySet()) {
                    registerForce.get(entry.getKey()).remove(name2);
                   // System.out.println();
                }
                if (registerForce.containsKey(side2)){
                    registerForce.get(side2).add(name2);
                    System.out.println(String.format("%s joins the %s side!", name2, side2));
                }else if (!registerForce.containsKey(side2)){
                    registerForce.put(side2, new ArrayList<>());
                    registerForce.get(side2).add(name2);
                    System.out.println(String.format("%s joins the %s side!", name2, side2));
                }

            }
            input = scan.nextLine();
        }
        registerForce.entrySet().stream().sorted((s1, s2) -> Integer.compare(s2.getValue().size(), s1.getValue().size()))
                .forEach(e -> {
                    if (!e.getValue().isEmpty()) {
                        System.out.printf("Side: %s, Members: %d%n", e.getKey(), e.getValue().size());
                        e.getValue().stream().sorted((p1, p2) -> p1.compareTo(p2)).forEach(p -> System.out.printf("! %s%n", p));
                    }

                });
    }
}


