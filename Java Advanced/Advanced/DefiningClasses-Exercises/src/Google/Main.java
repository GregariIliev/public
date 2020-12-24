package Google;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Person> personMap = new HashMap<>();

        String input = scan.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String typeClass = tokens[1];

            String personName = tokens[0];
            Person person;


            if ("company".equals(typeClass)) {
                Company company = Company.createCompany(tokens);
                if (!personMap.containsKey(personName)) {
                    person = new Person(company);
                    personMap.putIfAbsent(personName, person);

                } else {
                    personMap.get(personName).setCompany(company);
                }

            } else if ("car".equals(typeClass)) {
                Car car = Car.createCar(tokens);
                if (!personMap.containsKey(personName)) {
                    person = new Person(car);
                    personMap.putIfAbsent(personName, person);
                }
                personMap.get(personName).setCar(car);//???????????????????????????????????

            } else if ("parents".equals(typeClass)) {
                Parents parents = Parents.createParents(tokens);
                if (!personMap.containsKey(personName)) {
                    person = new Person(parents);
                    personMap.putIfAbsent(personName, person);
                }
                if (personMap.get(personName).getParentsList() == null){
                    personMap.get(personName).setParentsList();
                }
                personMap.get(personName).addParent(parents);

            } else if ("children".equals(typeClass)) {
                Children children = Children.createChildren(tokens);
                if (!personMap.containsKey(personName)) {
                    person = new Person(children);
                    personMap.putIfAbsent(personName, person);
                }
                if (personMap.get(personName).getChildrenList() == null){
                    personMap.get(personName).setChildrenList();
                }
                personMap.get(personName).addChildren(children);

            } else if ("pokemon".equals(typeClass)) {
                Pokemon pokemon = Pokemon.createPokemon(tokens);
                if (!personMap.containsKey(personName)) {
                    person = new Person(pokemon);
                    personMap.putIfAbsent(personName, person);
                }
                if (personMap.get(personName).getPokemonList() == null){
                    personMap.get(personName).setPokemonList();
                }
                personMap.get(personName).addPokemon(pokemon);
            }


            input = scan.nextLine();
        }

        printPerson(scan, personMap);
    }

    public static void printPerson(Scanner scan, Map<String, Person> personMap) {
        String personInput = scan.nextLine();

        if (personMap.containsKey(personInput)) {
            System.out.println(personInput);
            Person person = personMap.get(personInput);
            person.companyPrint();
            person.carPrint();
            person.pokemonPrint();
            person.parentsPrint();
            person.childrenPrint();
        }
    }
}