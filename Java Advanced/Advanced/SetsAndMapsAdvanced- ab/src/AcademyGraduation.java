import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, double[]> students = new TreeMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double[] scores = Arrays.stream(scan.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
            students.putIfAbsent(name,scores);
        }

        for (Map.Entry<String, double[]> student : students.entrySet()) {
            System.out.printf("%s is graduated with %s%n",student.getKey(), average(student.getValue()));
        }
    }

    public static double average(double[] score){
        double avr = 0.0;
        for (double v : score) {
            avr += v;
        }
        return avr / score.length;
    }
}
