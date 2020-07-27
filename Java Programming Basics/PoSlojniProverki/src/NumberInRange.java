import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numb = Integer.parseInt(scan.nextLine());
        boolean result = (numb <= 100 && numb >= -100 && numb != 0);

        if (result){
            System.out.println("Yes");
        }else System.out.println("No");
    }
}
