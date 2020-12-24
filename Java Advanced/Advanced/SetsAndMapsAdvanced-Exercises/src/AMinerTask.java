import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> recollection = new LinkedHashMap<>();

        String input = scan.nextLine();

        String currentMineral = "";
        int count = 1;
        while (!"stop".equals(input)){
            if (count % 2 == 1){
                currentMineral = input;
                recollection.putIfAbsent(input, 0);
            }else if (count % 2 == 0){
                recollection.put(currentMineral, recollection.get(currentMineral) + Integer.parseInt(input));
            }

            count++;
            input = scan.nextLine();
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : recollection.entrySet()) {
            System.out.printf("%s -> %d%n",stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
        }
    }
}
