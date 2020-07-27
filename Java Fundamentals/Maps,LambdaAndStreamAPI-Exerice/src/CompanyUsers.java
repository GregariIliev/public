import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> companyUsers = new HashMap<>();

        String input = scan.nextLine();

        while (!"End".equals(input)){
            String[] inputData = input.split(" -> ");
            String company = inputData[0];
            String ID = inputData[1];

            companyUsers.putIfAbsent(company, new ArrayList<>());
            if (!companyUsers.get(company).contains(ID)){
                companyUsers.get(company).add(ID);
            }

            input = scan.nextLine();
        }
        companyUsers.entrySet().stream().sorted((c1, c2) -> c1.getKey().compareTo(c2.getKey()))
                .forEach(c -> {
                    String company = c.getKey();

                    System.out.println(company);
                    for (String a : c.getValue()) {
                        System.out.printf("-- %s%n",a);
                    }

                });

    }
}
