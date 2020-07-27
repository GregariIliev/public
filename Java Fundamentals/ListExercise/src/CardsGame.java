import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstPlayer = cardToList(scan);
        List<Integer> secondPlayer = cardToList(scan);

        String winner = "";
        for (int i = 0; i < firstPlayer.size(); i++) {

            int firstPlayerCard = firstPlayer.get(i);
            int secondPlayerCard = secondPlayer.get(i);

            if (firstPlayerCard > secondPlayerCard){
                firstPlayer.add(firstPlayerCard);
                firstPlayer.add(secondPlayerCard);
                firstPlayer.remove(i);
                secondPlayer.remove(i);
            }else if (secondPlayerCard > firstPlayerCard){
                secondPlayer.add(secondPlayerCard);
                secondPlayer.add(firstPlayerCard);
                firstPlayer.remove(i);
                secondPlayer.remove(i);
            }else if (firstPlayerCard == secondPlayerCard){
                firstPlayer.remove(i);
                secondPlayer.remove(i);
            }
            if (firstPlayer.isEmpty()){
                winner = "Second";
                break;
            }else if (secondPlayer.isEmpty()){
                winner = "First";
                break;
            }
            i--;
        }
        int sum = Math.max(getMaxSum(firstPlayer), getMaxSum(secondPlayer));
        System.out.printf("%s player wins! Sum: %d",winner , sum);
    }

    private static int getMaxSum(List<Integer> list) {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        return result;
    }

    private static List<Integer> cardToList(Scanner scanner) {
        String[] text = scanner.nextLine().split("\\s+");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < text.length; i++) {
            int numb = Integer.parseInt(text[i]);
            list.add(numb);
        }

        return list;
    }
}
