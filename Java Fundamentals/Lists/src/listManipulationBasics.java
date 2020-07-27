import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String textList = scan.nextLine();

        String[] arrList = textList.split(" ");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arrList.length; i++) {
            int number = Integer.parseInt(arrList[i]);
            list.add(i , number);
        }

        String command = scan.nextLine();
        while (!"end".equals(command)){

            String[] commandText = command.split(" ");

            for (int i = 0; i < commandText.length; i++) {
                if ("Add".equals(commandText[i])) {
                    int numb = Integer.parseInt(commandText[i + 1]);
                    list.add(numb);
                } else if ("Remove".equals(commandText[i])) {
                    int numb = Integer.parseInt(commandText[i + 1]);
                    list.remove(Integer.valueOf(numb));
                }else if ("RemoveAt".equals(commandText[i])){
                    int numb = Integer.parseInt(commandText[i + 1]);
                    list.remove(numb);
                }else if ("Insert".equals(commandText[i])){
                    int numb = Integer.parseInt(commandText[i + 1]);
                    int index = Integer.parseInt(commandText[i + 2]);
                    list.add(index , numb);
                }
            }

            command = scan.nextLine();
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
