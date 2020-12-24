import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> personData = new LinkedHashMap<>();

        int count = 1;
        String name = "";

        String input = scan.nextLine();
        while (!"stop".equals(input)) {
            if (count % 2 == 1) {
                name = input;
                personData.putIfAbsent(input, "");
            } else if (count % 2 == 0) {
                if (!checkEmail(input)){
                    personData.put(name, input);
                }else {
                    personData.remove(name);
                }
            }

            count++;
            input = scan.nextLine();
        }

        for (Map.Entry<String, String> stringIntegerEntry : personData.entrySet()) {
            System.out.printf("%s -> %s%n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
        }
    }

    private static boolean checkEmail(String input) {
        boolean validEmail = false;

        int index = input.indexOf('.');
        String domain = input.substring(index + 1);
        if (domain.equals("us") || domain.equals("uk") || domain.equals("com")){
            validEmail = true;
        }

        return validEmail;
    }
}
