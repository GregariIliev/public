import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arrList = scan.nextLine().split("!");

        List<String> groceriesList = new ArrayList<>();

        for (int i = 0; i < arrList.length; i++) {
            groceriesList.add(arrList[i]);
        }

        String inputCommands = scan.nextLine();

        while (!"Go Shopping!".equals(inputCommands)){
            String[] allCommands = inputCommands.split("\\s+");

            String command = allCommands[0];

            if ("Urgent".equals(command)){
                String item = allCommands[1];
                if (!groceriesList.contains(item)){
                    groceriesList.add(0, item);
                }
            }else if ("Unnecessary".equals(command)){
                String item = allCommands[1];
                if (groceriesList.contains(item)){
                    groceriesList.remove(item);
                }
            }else if ("Correct".equals(command)){
                String oldItem = allCommands[1];
                String newItem = allCommands[2];
                if (groceriesList.contains(oldItem)){
                    int indexOldItem = groceriesList.indexOf(oldItem);
                    groceriesList.set(indexOldItem, newItem);
                }
            }else if ("Rearrange".equals(command)){
                String item = allCommands[1];
                if (groceriesList.contains(item)){
                    groceriesList.remove(item);
                    groceriesList.add(item);
                }
            }

            inputCommands = scan.nextLine();
        }

        System.out.println(String.join(", ",groceriesList));

    }
}
