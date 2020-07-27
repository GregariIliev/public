import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numb = Math.abs(Integer.parseInt(scan.nextLine()));
        while (numb % 2 == 1){
            System.out.println("Please write an even number.");
            numb = Math.abs(Integer.parseInt(scan.nextLine()));
        }
        System.out.printf("The number is: %d",Math.abs(numb));


    }
}
