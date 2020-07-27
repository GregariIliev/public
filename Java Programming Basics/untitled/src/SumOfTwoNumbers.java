import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstIntervalNumb = Integer.parseInt(scan.nextLine());
        int lastIntervalNumb = Integer.parseInt(scan.nextLine());
        int magicNumb = Integer.parseInt(scan.nextLine());
        boolean flag = false;
        int count = 0;

        for (int i = firstIntervalNumb; i <= lastIntervalNumb ; i++) {
            for (int j = firstIntervalNumb; j <= lastIntervalNumb ; j++) {
                count++;
                if (i + j == magicNumb){
                    System.out.printf("Combination N:%d (%d + %d = %d)",count ,i , j ,magicNumb);
                    flag = true;
                    break;
                }
            }
            if (flag){
                break;
            }
        }
        if (!flag){
            System.out.printf("%d combinations - neither equals %d",count ,magicNumb);
        }



    }
}
