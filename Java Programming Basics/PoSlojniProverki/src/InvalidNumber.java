import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numb = Integer.parseInt(scan.nextLine());

        boolean number = numb >= 100 && numb <= 200 || numb == 0;

        if (number){
        }else System.out.println("invalid");
    }
}
