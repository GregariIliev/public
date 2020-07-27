import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, String> register = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] commandData = scan.nextLine().split("\\s+");

            String command = commandData[0];
            String name = commandData[1];


            if ("register".equals(command)){
                String plateNumber = commandData[2];
                if (!register.containsKey(name)){
                    register.put(name, plateNumber);
                    System.out.printf("%s registered %s successfully%n",name ,plateNumber);
                }else {
                    System.out.printf("ERROR: already registered with plate number %s%n",plateNumber);
                }
            }else if ("unregister".equals(command)){
                if (!register.containsKey(name)){
                    System.out.printf("ERROR: user %s not found%n",name);
                }else if (register.containsKey(name)){
                    register.remove(name);
                    System.out.printf("%s unregistered successfully%n",name);
                }
            }
        }
        register
                .entrySet()
                .stream()
                .forEach(r -> System.out.printf("%s => %s%n",r.getKey(), r.getValue()));
    }
}
