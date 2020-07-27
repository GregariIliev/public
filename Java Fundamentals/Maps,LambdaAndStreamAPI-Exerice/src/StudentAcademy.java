import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<Double>> academy = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());
            if (!academy.containsKey(name)){
                academy.put(name, new ArrayList<>());
                academy.get(name).add(grade);
            }else {
                academy.get(name).add(grade);
            }
        }
        academy
                .entrySet()
                .stream()
                .filter(w -> w.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0) >= 4.50)
                .sorted((s1, s2) -> {
                    double s = s1.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0);
                    double d = s2.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0);
                    return Double.compare(d, s);
                }).forEach(a -> System.out.printf("%s -> %.2f%n",a.getKey() ,
                a.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0)));
    }
}
