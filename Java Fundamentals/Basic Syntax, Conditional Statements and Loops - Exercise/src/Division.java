import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numb = Integer.parseInt(scan.nextLine());

        for (int i = numb; i >= 0 ; i--) {
            if (i % 10 == 0){
                System.out.println("The number is divisible by 10");
                break;
            }else if (i % 7 == 0){
                System.out.println("The number is divisible by 7");
                break;
            }else if (i % 6 == 0){
                System.out.println("The number is divisible by 6");
                break;
            }else if (i % 3 == 0){
                System.out.println("The number is divisible by 3");
                break;
            }else if (i % 2 == 0){
                System.out.println("The number is divisible by 2");
                break;
            }else {
                System.out.println("Not divisible");
                break;
            }
        }
    }
}
