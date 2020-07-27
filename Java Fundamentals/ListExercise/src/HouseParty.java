import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nCommands = Integer.parseInt(scan.nextLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < nCommands; i++) {
            String commandsText = scan.nextLine();
            String[] command = commandsText.split("\\s+", 2);

            if ("is going!".equals(command[1])){
                String name = command[0];
                if (list.contains(name)){
                    System.out.println(name + " is already in the list!");
                }else {
                    list.add(name);
                }
            }else if ("is not going!".equals(command[1])){
                String name = command[0];
                if (list.contains(name)){
                    list.remove(name);
                }else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        for (String name : list) {
            System.out.println(name);
        }
    }
}
