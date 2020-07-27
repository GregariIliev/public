package OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String input = scan.nextLine();
        while (!"End".equals(input)){

            String[] personData = input.split("\\s+");
            String name = personData[0];
            String ID = personData[1];
            int age = Integer.parseInt(personData[2]);

            Person person = new Person(name, ID, age);

            personList.add(person);

            input = scan.nextLine();
        }

        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person: personList) {
            System.out.println(person.toString());
        }
    }
}
