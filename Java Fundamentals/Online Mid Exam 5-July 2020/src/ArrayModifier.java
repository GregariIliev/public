import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arrValuesText = scan.nextLine().split("\\s+");

        Integer[] arrValues = new Integer[arrValuesText.length];

        for (int i = 0; i < arrValues.length; i++) {
            arrValues[i] = Integer.parseInt(arrValuesText[i]);
        }

        String allCommands = scan.nextLine();
        while (!"end".equals(allCommands)){
            String[] commandsDataArray = allCommands.split("\\s+");

            String command = commandsDataArray[0];

            if ("swap".equals(command)){
                int index1 = Integer.parseInt(commandsDataArray[1]);
                int index2 = Integer.parseInt(commandsDataArray[2]);

                int currentToSwap = arrValues[index1];

                arrValues[index1] = arrValues[index2];
                arrValues[index2] = currentToSwap;
            }else if ("multiply".equals(command)){
                int index1 = Integer.parseInt(commandsDataArray[1]);
                int index2 = Integer.parseInt(commandsDataArray[2]);

                int result = arrValues[index1] * arrValues[index2];

                arrValues[index1] = result;
            }else if ("decrease".equals(command)){

                for (int i = 0; i < arrValues.length; i++) {
                    arrValues[i] = arrValues[i] - 1;
                }
            }
            allCommands = scan.nextLine();
        }

        System.out.println(" " + Arrays.toString(arrValues).replaceAll("[\\[|\\]]", ""));
    }
}
