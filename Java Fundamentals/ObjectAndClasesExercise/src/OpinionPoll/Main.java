import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] read = scan.nextLine().split("\\s+");
            Person person = new Person(read[0], Integer.parseInt(read[1]));

            personList.add(person);
        }
        personList = personList.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());

        for (int i = 0; i < personList.size(); i++) {
            boolean isIt = personList.get(i).moreThan30();
            if (isIt){
                personList.get(i).print();
            }
        }
    }
}
