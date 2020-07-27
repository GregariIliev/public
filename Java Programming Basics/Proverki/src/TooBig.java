import java.util.Scanner;

public class TooBig {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb = Integer.parseInt(scan.nextLine());
        if (numb == 1){
            System.out.println("one");
        }else if (numb == 2){
            System.out.println("two");
        }else if (numb == 3){
            System.out.println("three");
        }else if (numb == 4){
            System.out.println("four");
        }else if (numb == 5){
            System.out.println("five");
        }else if (numb == 6){
            System.out.println("six");
        }else if (numb == 7){
            System.out.println("seven");
        }else if (numb == 8){
            System.out.println("eight");
        }else if (numb == 9){
            System.out.println("nine");
        }else if (numb>9){
            System.out.println("number too big");
        }
    }
}
