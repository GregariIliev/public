import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numbersInput = Arrays.stream(scan.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> mapNumbers = new LinkedHashMap<>();

        for (int i = 0; i < numbersInput.length; i++) {
            double currentNumber = numbersInput[i];

            mapNumbers.putIfAbsent(currentNumber, 0);
            if (mapNumbers.containsKey(currentNumber)){
                mapNumbers.put(currentNumber, mapNumbers.get(currentNumber) + 1);
            }
        }

        for (Map.Entry<Double, Integer> doubleIntegerEntry : mapNumbers.entrySet()) {
            System.out.printf("%.1f -> %d%n",doubleIntegerEntry.getKey(), doubleIntegerEntry.getValue());
        }
    }
}
