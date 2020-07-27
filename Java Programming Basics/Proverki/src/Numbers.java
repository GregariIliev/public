import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb = Integer.parseInt(scan.nextLine());
        if (numb<100){
            System.out.println("Less than 100");
        }else if (numb>200){
            System.out.println("Greater than 200");
        }else {
            System.out.println("Between 100 and 200");
        }
    }
}
