import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumAdjacentEqualsNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] list = scan.nextLine().split(" ");
        List<Double> numbList = new ArrayList<>();

        for (int i = 0; i < list.length; i++) {
            double numb = Double.parseDouble(list[i]);
            numbList.add(numb);
        }
        for (int i = 0; i < numbList.size() - 1; i++) {
            if (numbList.get(i).equals(numbList.get(i + 1))){
                double sumNumb = numbList.get(i) + numbList.get(i + 1);
                numbList.set(i, sumNumb);
                numbList.remove(i + 1);
                i = -1;
            }
        }
        for (Double numbers:numbList) {
            System.out.print(new DecimalFormat("0.#").format(numbers) + " ");
        }
    }
}
