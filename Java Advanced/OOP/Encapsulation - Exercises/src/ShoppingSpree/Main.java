import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] personsData = scan.nextLine().split(";");
        String[] productData = scan.nextLine().split(";");

        Map<String, Person> persons = null;
        Map<String, Product> products = null;

        try {
            persons = fillPersonData(personsData);
            products = fillProduct(productData);
        } catch (IllegalAccessException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        String commands = scan.nextLine();
        while (!"END".equals(commands)){
            String[] data = commands.split("\\s+");
            Person person = getPerson(persons, data[0]);
            Product product = getProduct(products, data[1]);

            try {
                person.buyProduct(product);
                System.out.printf("%s bought %s%n",person.getName(), product.getName());
            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
            }

            commands = scan.nextLine();
        }


        for (Person person : persons.values()) {
            if (person.getProducts().size() <= 0){
                System.out.println(person.getName() + " - Nothing bought");
                continue;
            }
            System.out.print(person.getName() + " - ");
            String output = person.getProducts().stream()
                    .map(Product::getName)
                    .collect(Collectors.joining(", "));
            System.out.println(output);

        }

    }

    private static Product getProduct(Map<String, Product> products, String datum) {
        Product product = null;
        if (products.containsKey(datum)){
            product = products.get(datum);
        }
        return product;
    }

    private static Person getPerson(Map<String, Person> persons, String data) {
        Person person = null;
        if (persons.containsKey(data)){
            person = persons.get(data);
        }
        return person;
    }

    private static Map<String, Person> fillPersonData(String[] personsData) throws IllegalAccessException {
        Map<String, Person> persons = new LinkedHashMap<>();

        for (String personsDatum : personsData) {
            String[] split = personsDatum.split("=");
            Person person = new Person(split[0], Double.parseDouble(split[1]));
            persons.put(person.getName(), person);
        }
        return persons;
    }

    private static Map<String, Product> fillProduct(String[] productData) throws IllegalAccessException {
        Map<String, Product> products = new LinkedHashMap<>();

        for (String productDatum : productData) {
            String[] split = productDatum.split("=");
            Product product = new Product(split[0], Double.parseDouble(split[1]));
            products.put(product.getName(), product);
        }
        return products;

    }
}
