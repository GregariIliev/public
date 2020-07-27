import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstText = scan.nextLine();
        String secondText = scan.nextLine();

        List<Integer> firstList = stringToList(firstText);
        List<Integer> secondList = stringToList(secondText);

        int minSizeList = Math.min(firstList.size() , secondList.size());

        for (int i = 0; i < minSizeList; i++) {
            System.out.print(firstList.get(i) + " ");
            System.out.print(secondList.get(i) + " ");
        }

        printRemainingListOfList(minSizeList, firstList);
        printRemainingListOfList(minSizeList, secondList);
    }

    private static void printRemainingListOfList(int minSizeList, List<Integer> firstList) {
        for (int i = minSizeList; i < firstList.size(); i++) {
            System.out.print(firstList.get(i) + " ");
        }
    }

    private static List<Integer> stringToList(String text) {
        String[] arr = text.split(" ");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int currentNumb = Integer.parseInt(arr[i]);
            list.add(i,currentNumb);
        }
        return list;
    }
}
