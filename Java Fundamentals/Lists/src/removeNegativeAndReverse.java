import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class removeNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String[] arrText = text.split(" ");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arrText.length; i++) {
            int numb = Integer.parseInt(arrText[i]);
            list.add(numb);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0){
                list.remove(list.get(i));
                i--;
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        if (list.isEmpty()){
            System.out.println("empty");
        }
    }
}
