import java.util.Scanner;

public class GreatNumb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb1 = Integer.parseInt(scan.nextLine());
        int numb2 = Integer.parseInt(scan.nextLine());
        if (numb1>numb2) {
            System.out.println(numb1);

        }else {
            System.out.println(numb2);}
    }
}
