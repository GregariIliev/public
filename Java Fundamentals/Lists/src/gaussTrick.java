import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String[] arrNumbs = text.split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < arrNumbs.length; i++) {
            int numb = Integer.parseInt(arrNumbs[i]);

            numbers.add(numb);
        }
        if (numbers.size() % 2 == 1){
            for (int j = 0; j < numbers.size() / 2; j++) {
                int currentNumb1 = numbers.get(j);
                int currentNumb2 = numbers.get(numbers.size() - 1);
                int result = currentNumb1 + currentNumb2;
                numbers.set(j , result);
                numbers.remove(numbers.size() - 1);
            }
        }else {
            for (int i = 0; i < numbers.size(); i++) {
                int currentNumb1 = numbers.get(i);
                int currentNumb2 = numbers.get(numbers.size() - 1);
                int result = currentNumb1 + currentNumb2;
                numbers.set(i , result);
                numbers.remove(numbers.size() - 1);
            }
        }

        for (Integer numb:numbers) {
            System.out.print(numb + " ");
        }
    }
}
