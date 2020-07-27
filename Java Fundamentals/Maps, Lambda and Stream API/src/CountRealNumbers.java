import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputArr = scan.nextLine().split("\\s+");

        Map<Double, Integer> countNumbers = new TreeMap<>();

        for (int i = 0; i < inputArr.length; i++) {
            double numb = Double.parseDouble(inputArr[i]);

            if (countNumbers.containsKey(numb)){
                countNumbers.put(numb, countNumbers.get(numb) + 1);
            }else {
                countNumbers.put(numb, 1);
            }
        }

        DecimalFormat newFormat = new DecimalFormat("#,#######");

        for (Map.Entry<Double, Integer> entry : countNumbers.entrySet()) {

            System.out.printf("%s -> %d%n",newFormat.format(entry.getKey()), entry.getValue());
        }
    }
}
