import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String[] arrText = text.split("\\s+");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arrText.length; i++) {
            int numb = Integer.parseInt(arrText[i]);

            list.add(numb);
        }

        String line = scan.nextLine();

        while (!"End".equals(line)){
            String[] commands = line.split("\\s+");
            if ("Add".equals(commands[0])){
                int numb = Integer.parseInt(commands[1]);
                list.add(numb);
            }else if ("Insert".equals(commands[0])){
                int numb = Integer.parseInt(commands[1]);
                int index = Integer.parseInt(commands[2]);
                if (index >= 0 && index < list.size()){
                    list.add(index, numb);
                }else {
                    System.out.println("Invalid index");
                }
            }else if ("Remove".equals(commands[0])){
                int index = Integer.parseInt(commands[1]);
                if (index >= 0 && index < list.size()){
                    list.remove(index);
                }else {
                    System.out.println("Invalid index");
                }
            }else if ("left".equals(commands[1])){
                int count = Integer.parseInt(commands[2]);
                for (int i = 0; i < count; i++) {
                    int index = 0;
                    int currentNumb = list.get(index);
                    list.add(currentNumb);
                    list.remove(index);

                }
            }else if ("right".equals(commands[1])){
                int count = Integer.parseInt(commands[2]);
                for (int i = 0; i < count; i++) {
                    int index = list.size() - 1;
                    int currentNumb = list.get(index);
                    list.add(0 , currentNumb);
                    list.remove(list.size() - 1);
                }
            }

            line = scan.nextLine();
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
