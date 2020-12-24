import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        ListIterator<String> listIterator = null;

        while (!"END".equals(input)){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];


            if (command.equals("Create")){
                listIterator = new ListIterator<>(Arrays.stream(tokens).skip(1).toArray(String[]::new));

            }else if (command.equals("Move")){
                System.out.println(listIterator.move());

            }else if (command.equals("HasNext")){
                System.out.println(listIterator.hasNext());

            }else if (command.equals("Print")){
                listIterator.print();

            }

            input = scan.nextLine();
        }
    }
}
