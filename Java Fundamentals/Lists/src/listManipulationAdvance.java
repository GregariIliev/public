import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listManipulationAdvance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String listText = scan.nextLine();

        String[] listArr = listText.split(" ");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < listArr.length; i++) {
            int num = Integer.parseInt(listArr[i]);
            list.add(i , num);
        }

        String command = scan.nextLine();

        while (!"end".equals(command)){
            String[] commands = command.split(" ");

            if ("Contains".equals(commands[0])){
                int numb = Integer.parseInt(commands[1]);

                if (list.contains(numb)){
                    System.out.println("Yes");
                }else {
                    System.out.println("No such number");
                }
            }else if ("Print even".equals(command)){
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) % 2 == 0){
                        System.out.print(list.get(i) + " ");
                    }
                }
                System.out.println();
            }else if ("Print odd".equals(command)){
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) % 2 == 1){
                        System.out.print(list.get(i) + " ");
                    }
                }
                System.out.println();
            }else if ("Get sum".equals(command)){
                int sum = 0;
                for (int i = 0; i < list.size(); i++) {
                    sum = sum + list.get(i);
                }
                System.out.println(sum);
            }else if ("Filter".equals(commands[0])){
                if ("<".equals(commands[1])){
                    for (int i = 0; i < list.size(); i++) {
                        int numb = Integer.parseInt(commands[2]);
                        if (list.get(i) < numb){
                            System.out.print(list.get(i) + " ");
                        }
                    }
                    System.out.println();
                }else if (">".equals(commands[1])){
                    for (int i = 0; i < list.size(); i++) {
                        int numb = Integer.parseInt(commands[2]);
                        if (list.get(i) > numb){
                            System.out.print(list.get(i) + " ");
                        }
                    }
                    System.out.println();
                }else if (">=".equals(commands[1])){
                    for (int i = 0; i < list.size(); i++) {
                        int numb = Integer.parseInt(commands[2]);
                        if (list.get(i) >= numb){
                            System.out.print(list.get(i) + " ");
                        }
                    }
                    System.out.println();
                }if ("<=".equals(commands[1])){
                    for (int i = 0; i < list.size(); i++) {
                        int numb = Integer.parseInt(commands[2]);
                        if (list.get(i) <= numb){
                            System.out.print(list.get(i) + " ");
                        }
                    }
                    System.out.println();
                }
            }
            command = scan.nextLine();
        }
    }
}
