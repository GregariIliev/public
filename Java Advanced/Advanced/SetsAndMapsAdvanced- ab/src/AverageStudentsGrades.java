import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<Double>> students = new TreeMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);

            if (!students.containsKey(name)){
                students.put(name, new ArrayList<>());
            }
            students.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> student : students.entrySet()) {
            System.out.print(student.getKey() + " -> ");
            student.getValue().forEach(e -> System.out.printf("%.2f ",e));
            double average = student.getValue().stream().mapToDouble(e -> e).average().orElse(0);
            System.out.printf("(avg: %.2f)%n",average);
        }
    }
}
