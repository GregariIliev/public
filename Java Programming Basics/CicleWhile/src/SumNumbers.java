import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numb = scan.nextLine();
        int  sum = 0;
        while (!numb.equals("Stop")){
            int number = Integer.parseInt(numb);
            sum = sum + number;
            numb = scan.nextLine();
        }
        System.out.println(sum);
    }
}
