import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> minerMap = new LinkedHashMap<>();

        String mineral = scan.nextLine();
        while (!"stop".equals(mineral)){

            int quantity = Integer.parseInt(scan.nextLine());

            minerMap.putIfAbsent(mineral, 0);
            minerMap.put(mineral, minerMap.get(mineral) + quantity);


            mineral = scan.nextLine();
        }
        for (Map.Entry<String, Integer> entry : minerMap.entrySet()){
            System.out.printf("%s -> %d%n",entry.getKey(), entry.getValue());
        }
    }
}
