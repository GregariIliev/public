import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scan.nextLine();

        while (!"end".equals(input)){
            String[] courseData = input.split(" : ");
            String courseName = courseData[0];
            String personName = courseData[1];

            if (!courses.containsKey(courseName)){
                courses.put(courseName, new ArrayList<>());
                courses.get(courseName).add(personName);
            }else {
                courses.get(courseName).add(personName);
            }
            input = scan.nextLine();
            System.out.println();
        }
        courses.entrySet().stream().sorted((s , d) -> Integer.compare(d.getValue().size(), s.getValue().size()))
                .forEach(a -> {
                    System.out.printf("%s: %d%n",a.getKey(), a.getValue().size());
                    a.getValue().stream().sorted((x, c) -> x.compareTo(c)).forEach(q -> System.out.printf("-- %s%n",q));
                });


    }
}
