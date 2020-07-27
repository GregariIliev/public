import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendArrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split("\\|");

        List<String> list = new ArrayList<>();

        for (int i = line.length - 1; i >= 0; i--) {
            String[] currentArray = line[i].split("\\s+");
            for (String s : currentArray) {
                if (!"".equals(s)){
                    list.add(s);
                }
            }
        }

        System.out.println(String.join(" ",list));
    }
}
