import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().split("\\s+");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int numb = Integer.parseInt(arr[i]);
            list.add(numb);
        }

        String[] specialNumbers = scan.nextLine().split("\\s+");

        int bomb = Integer.parseInt(specialNumbers[0]);
        int power = Integer.parseInt(specialNumbers[1]);
        int countIndexLeft = -1;
        for (int i = 0; i < list.size(); i++) {
            countIndexLeft ++;
            if (bomb == list.get(i)){
                int maxIndexRight = list.size() - 1 - i;
                int newPowerRight = Math.min(power, maxIndexRight);
                for (int j = 0; j < newPowerRight; j++) {
                    list.remove(i + 1);
                }
                int newPowerLeft = Math.min(countIndexLeft, power);
                for (int j = 0; j < newPowerLeft ; j++) {
                    list.remove(i - 1);
                    i--;
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list.remove(Integer.valueOf(bomb));
        }

        int result = 0;

        for (int i = 0; i < list.size(); i++) {
            result = result + list.get(i);
        }
        System.out.println(result);
    }
}
