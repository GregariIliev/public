import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String[] arr = text.split("\\s+");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int numb = Integer.parseInt(arr[i]);
            list.add(i, numb);
        }

        String command = scan.nextLine();

        while (!"end".equals(command)){
            String[] commands = command.split("\\s+");

            if ("Delete".equals(commands[0])){
                int numb = Integer.parseInt(commands[1]);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == numb){
                        list.remove(Integer.valueOf(numb));
                        i--;
                    }
                }
            }else if ("Insert".equals(commands[0])){
                int element = Integer.parseInt(commands[1]);
                int index = Integer.parseInt(commands[2]);
                if (index >= 0 && index <= list.size()- 1){
                    list.add(index, element);
                }
            }
            command = scan.nextLine();
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
