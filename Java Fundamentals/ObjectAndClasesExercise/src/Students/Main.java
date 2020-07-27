package Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Students> studentsList = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);

            Students students = new Students(firstName, lastName, grade);
            studentsList.add(students);
        }

        studentsList.stream().sorted((p1, p2) -> Double.compare(p2.getGrade(), p1.getGrade())).forEach(students -> students.ToString());

    }
}
