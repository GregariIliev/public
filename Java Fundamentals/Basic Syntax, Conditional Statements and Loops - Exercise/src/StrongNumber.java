import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String textNumber = scan.nextLine();
        int finalSum = 0;
        for (int i = 0; i < textNumber.length(); i++) {
            int numb = Integer.parseInt("" + textNumber.charAt(i));
            int currentSum = 1;
            for (int j = 1; j <= numb ; j++) {
                currentSum *= j;
            }
            finalSum += currentSum;
        }
        int allNumber = Integer.parseInt(textNumber);
        if (allNumber == finalSum){
            System.out.println("yes");
        }else
            System.out.println("no");
    }
}
